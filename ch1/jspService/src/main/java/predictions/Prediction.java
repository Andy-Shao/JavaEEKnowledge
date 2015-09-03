package predictions;

import java.io.Serializable;

public class Prediction implements Serializable {
    private static final long serialVersionUID = -8538985163293745447L;
    private String what; // his/her prediction
    private String who; // person

    public Prediction() {
    }

    public String getWhat() {
        return this.what;
    }

    public String getWho() {
        return this.who;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public void setWho(String who) {
        this.who = who;
    }
}