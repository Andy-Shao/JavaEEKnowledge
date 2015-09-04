package predictions3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;

@Path("/")
public class PredictionsRS {
    private static PredictionsList plist; // set in populate()
    @Context
    private ServletContext sctx; // dependency injection

    public PredictionsRS() {
    }

    // Add a new prediction to the list.
    private int addPrediction(String who , String what) {
        int id = PredictionsRS.plist.add(who , what);
        return id;
    }

    //** utilities
    private void checkContext() {
        if (PredictionsRS.plist == null) this.populate();
    }

    @POST
    @Produces({
        MediaType.TEXT_PLAIN
    })
    @Path("/create")
    public Response create(@FormParam("who") String who , @FormParam("what") String what) {
        this.checkContext();
        String msg = null;
        // Require both properties to create.
        if (who == null || what == null) {
            msg = "Property 'who' or 'what' is missing.\n";
            return Response.status(Response.Status.BAD_REQUEST).entity(msg).type(MediaType.TEXT_PLAIN).build();
        }
        // Otherwise, create the Prediction and add it to the collection.
        int id = this.addPrediction(who , what);
        msg = "Prediction " + id + " created: (who = " + who + " what = " + what + ").\n";
        return Response.ok(msg , "text/plain").build();
    }

    @DELETE
    @Produces({
        MediaType.TEXT_PLAIN
    })
    @Path("/delete/{id: \\d+}")
    public Response delete(@PathParam("id") int id) {
        this.checkContext();
        String msg = null;
        Prediction p = PredictionsRS.plist.find(id);
        if (p == null) {
            msg = "There is no prediction with ID " + id + ". Cannot delete.\n";
            return Response.status(Response.Status.BAD_REQUEST).entity(msg).type(MediaType.TEXT_PLAIN).build();
        }
        PredictionsRS.plist.getPredictions().remove(p);
        msg = "Prediction " + id + " deleted.\n";

        return Response.ok(msg , "text/plain").build();
    }

    @GET
    @Produces({
        MediaType.APPLICATION_JSON
    })
    @Path("/json")
    public Response getJson() {
        this.checkContext();
        return Response.ok(this.toJson(PredictionsRS.plist) , "application/json").build();
    }

    @GET
    @Produces({
        MediaType.APPLICATION_JSON
    })
    @Path("/json/{id: \\d+}")
    public Response getJson(@PathParam("id") int id) {
        this.checkContext();
        return this.toRequestedType(id , "application/json");
    }

    @GET
    @Path("/plain")
    @Produces({
        MediaType.TEXT_PLAIN
    })
    public String getPlain() {
        this.checkContext();
        return PredictionsRS.plist.toString();
    }

    @GET
    @Path("/xml")
    @Produces({
        MediaType.APPLICATION_XML
    })
    public Response getXml() {
        this.checkContext();
        return Response.ok(PredictionsRS.plist , "application/xml").build();
    }

    @GET
    @Path("/xml/{id: \\d+}")
    @Produces({
        MediaType.APPLICATION_XML
    })
    // could use "application/xml" instead
        public
        Response getXml(@PathParam("id") int id) {
        this.checkContext();
        return this.toRequestedType(id , "application/xml");
    }

    private void populate() {
        PredictionsRS.plist = new PredictionsList();

        String filename = "/WEB-INF/data/predictions.db";
        InputStream in = this.sctx.getResourceAsStream(filename);

        // Read the data into the array of Predictions. 
        if (in != null) try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String record = null;
            while ((record = reader.readLine()) != null) {
                String[] parts = record.split("!");
                this.addPrediction(parts[0] , parts[1]);
            }
        } catch (Exception e) {
            throw new RuntimeException("I/O failed!");
        }
    }

    // Prediction --> JSON document
    private String toJson(Prediction prediction) {
        String json = "If you see this, there's a problem.";
        try {
            json = new ObjectMapper().writeValueAsString(prediction);
        } catch (Exception e) {
        }
        return json;
    }

    // PredictionsList --> JSON document
    private String toJson(PredictionsList plist) {
        String json = "If you see this, there's a problem.";
        try {
            json = new ObjectMapper().writeValueAsString(plist);
        } catch (Exception e) {
        }
        return json;
    }

    // Generate an HTTP error response or typed OK response.
    private Response toRequestedType(int id , String type) {
        Prediction pred = PredictionsRS.plist.find(id);
        if (pred == null) {
            String msg = id + " is a bad ID.\n";
            return Response.status(Response.Status.BAD_REQUEST).entity(msg).type(MediaType.TEXT_PLAIN).build();
        } else if (type.contains("json")) return Response.ok(this.toJson(pred) , type).build();
        else return Response.ok(pred , type).build(); // toXml is automatic
    }

    @PUT
    @Produces({
        MediaType.TEXT_PLAIN
    })
    @Path("/update")
    public Response update(@FormParam("id") int id , @FormParam("who") String who , @FormParam("what") String what) {
        this.checkContext();

        // Check that sufficient data are present to do an edit.
        String msg = null;
        if (who == null && what == null) msg = "Neither who nor what is given: nothing to edit.\n";

        Prediction p = PredictionsRS.plist.find(id);
        if (p == null) msg = "There is no prediction with ID " + id + "\n";

        if (msg != null) return Response.status(Response.Status.BAD_REQUEST).entity(msg).type(MediaType.TEXT_PLAIN)
            .build();
        // Update.
        if (who != null) p.setWho(who);
        if (what != null) p.setWhat(what);
        msg = "Prediction " + id + " has been updated.\n";
        return Response.ok(msg , "text/plain").build();
    }
}
