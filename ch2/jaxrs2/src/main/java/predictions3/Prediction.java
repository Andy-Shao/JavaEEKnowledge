package predictions3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "prediction")
public class Prediction implements Comparable<Prediction> {
    //** properties
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

    @XmlElement
    public int getId() {
        return this.id;
    }

    @XmlElement
    public String getWhat() {
        return this.what;
    }

    @XmlElement
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

    @Override
    public String toString() {
        return String.format("%2d: " , this.id) + this.who + " ==> " + this.what + "\n";
    }
}