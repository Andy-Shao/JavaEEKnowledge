package predictions3;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "predictionsList")
public class PredictionsList {
    private AtomicInteger predId;
    private List<Prediction> preds;

    public PredictionsList() {
        this.preds = new CopyOnWriteArrayList<Prediction>();
        this.predId = new AtomicInteger();
    }

    public int add(String who , String what) {
        int id = this.predId.incrementAndGet();
        Prediction p = new Prediction();
        p.setWho(who);
        p.setWhat(what);
        p.setId(id);
        this.preds.add(p);
        return id;
    }

    public Prediction find(int id) {
        Prediction pred = null;
        // Search the list -- for now, the list is short enough that
        // a linear search is ok but binary search would be better if the
        // list got to be an order-of-magnitude larger in size.
        for (Prediction p : this.preds)
            if (p.getId() == id) {
                pred = p;
                break;
            }
        return pred;
    }

    @XmlElement
    @XmlElementWrapper(name = "predictions")
    public List<Prediction> getPredictions() {
        return this.preds;
    }

    public void setPredictions(List<Prediction> preds) {
        this.preds = preds;
    }

    @Override
    public String toString() {
        String s = "";
        for (Prediction p : this.preds)
            s += p.toString();
        return s;
    }
}