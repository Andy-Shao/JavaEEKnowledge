package predictions2;

import java.io.Serializable;

// An array of Predictions is to be serialized
// into an XML or JSON document, which is returned to 
// the consumer on a request. 
public class Prediction implements Serializable , Comparable<Prediction> {
    private static final long serialVersionUID = -6258036711691832468L;
    private int id; // identifier used as lookup-key
    private String what; // his/her prediction
    private String who; // person

    public Prediction() {
    }

    // implementation of Comparable interface
    @Override
    public int compareTo(Prediction other) {
        return this.id - other.id;
    }

    public int getId() {
        return this.id;
    }

    public String getWhat() {
        return this.what;
    }

    public String getWho() {
        return this.who;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public void setWho(String who) {
        this.who = who;
    }
}