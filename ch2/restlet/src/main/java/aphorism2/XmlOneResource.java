package aphorism2;

import java.util.List;

import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.ext.xml.DomRepresentation;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlOneResource extends ServerResource {
    public XmlOneResource() {
    }

    private StringRepresentation badRequest(String msg) {
        Status error = new Status(Status.CLIENT_ERROR_BAD_REQUEST , msg);
        return new StringRepresentation(error.toString());
    }

    @Get
    public Representation toXml() {
        // Extract the adage's id.
        String sid = (String) this.getRequest().getAttributes().get("id");
        if (sid == null) return this.badRequest("No ID provided\n");

        int id;
        try {
            id = Integer.parseInt(sid.trim());
        } catch (Exception e) {
            return this.badRequest("No such ID\n");
        }

        // Search for the Adage.
        @SuppressWarnings("unused")
        List<Adage> list = Adages.getList();
        Adage adage = Adages.find(id);
        if (adage == null) return this.badRequest("No adage with ID " + id + "\n");

        // Generate the XML response.
        DomRepresentation dom = null;
        try {
            dom = new DomRepresentation(MediaType.TEXT_XML);
            dom.setIndenting(true);
            Document doc = dom.getDocument();

            Element root = doc.createElement("adage");
            root.appendChild(doc.createTextNode(adage.toString()));
            doc.appendChild(root);
        } catch (Exception e) {
        }
        return dom;
    }
}
