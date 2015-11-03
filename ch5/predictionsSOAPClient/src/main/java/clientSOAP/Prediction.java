package clientSOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prediction" , propOrder = { "id" , "what" , "who" })
public class Prediction {

    protected int id;
    protected String what;
    protected String who;

    public int getId() {
        return this.id;
    }

    public String getWhat() {
        return this.what;
    }

    public String getWho() {
        return this.who;
    }

    public void setId(int value) {
        this.id = value;
    }

    public void setWhat(String value) {
        this.what = value;
    }

    public void setWho(String value) {
        this.who = value;
    }

}
