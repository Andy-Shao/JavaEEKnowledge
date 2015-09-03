package predictions;

import java.beans.XMLEncoder; // simple and effective
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;

public class Predictions {
    private int n = 32;
    private Prediction[] predictions;
    private ServletContext sctx;

    public Predictions() {
    }

    public String getPredictions() {
        // Has the ServletContext been set?
        if (this.getServletContext() == null) return null;

        // Have the data been read already?
        if (this.predictions == null) this.populate();

        // Convert the Predictions array into an XML document
        return this.toXML();
    }

    public ServletContext getServletContext() {
        return this.sctx;
    }

    //** utilities
    private void populate() {
        String filename = "/WEB-INF/data/predictions.db";
        InputStream in = this.sctx.getResourceAsStream(filename);

        // Read the data into the array of Predictions. 
        if (in != null) try {
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(isr);

            this.predictions = new Prediction[this.n];
            int i = 0;
            String record = null;
            while ((record = reader.readLine()) != null) {
                String[] parts = record.split("!");
                Prediction p = new Prediction();
                p.setWho(parts[0]);
                p.setWhat(parts[1]);

                this.predictions[i++] = p;
            }
        } catch (IOException e) {
        }
    }

    // getPredictions returns an XML representation of
    // the Predictions array
    public void setPredictions(String ps) {
    } // no-op

    // The ServletContext is required to read the data from
    // a text file packaged inside the WAR file
    public void setServletContext(ServletContext sctx) {
        this.sctx = sctx;
    }

    private String toXML() {
        String xml = null;
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            XMLEncoder encoder = new XMLEncoder(out);
            encoder.writeObject(this.predictions); // serialize to XML
            encoder.close();
            xml = out.toString(); // stringify
        } catch (Exception e) {
        }
        return xml;
    }
}
