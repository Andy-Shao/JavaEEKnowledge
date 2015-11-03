package predictions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletContext;

public class Predictions {
    private AtomicInteger mapKey;
    private ConcurrentMap<Integer , Prediction> predictions;
    private ServletContext sctx;

    public Predictions() {
        this.predictions = new ConcurrentHashMap<Integer , Prediction>();
        this.mapKey = new AtomicInteger();
    }

    public int addPrediction(Prediction p) {
        int id = this.mapKey.incrementAndGet();
        p.setId(id);
        this.predictions.put(id , p);
        return id;
    }

    public ConcurrentMap<Integer , Prediction> getMap() {
        if (this.good2Go()) return this.predictions;
        else return null;
    }

    public Prediction getPrediction(int id) {
        return this.predictions.get(id);
    }

    public List<Prediction> getPredictions() {
        List<Prediction> list;
        if (this.good2Go()) {
            Object[] preds = this.predictions.values().toArray();
            Arrays.sort(preds);

            list = new ArrayList<Prediction>();
            for (Object obj : preds)
                list.add((Prediction) obj);
            return list;
        } else return null;
    }

    public ServletContext getServletContext() {
        return this.sctx;
    }

    //** utilities
    private boolean good2Go() {
        if (this.getServletContext() == null) return false;

        if (this.predictions.size() < 1) this.populate();
        return true;
    }

    private void populate() {
        String filename = "/WEB-INF/data/predictions.db";
        InputStream in = this.sctx.getResourceAsStream(filename);

        // Read the data into the array of Predictions. 
        if (in != null) try {
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(isr);

            @SuppressWarnings("unused")
            int i = 0;
            String record = null;
            while ((record = reader.readLine()) != null) {
                String[] parts = record.split("!");
                Prediction p = new Prediction();
                p.setWho(parts[0]);
                p.setWhat(parts[1]);
                this.addPrediction(p);
            }
        } catch (IOException e) {
        }
    }

    public void setMap(ConcurrentMap<String , Prediction> predictions) {
    }

    public void setServletContext(ServletContext sctx) {
        this.sctx = sctx;
    }
}
