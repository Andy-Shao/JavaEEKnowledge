package predictions.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "edit" , namespace = "http://predictions/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edit" , namespace = "http://predictions/" , propOrder = { "arg0" , "arg1" , "arg2" })
public class Edit {

    @XmlElement(name = "arg0" , namespace = "")
    private int arg0;
    @XmlElement(name = "arg1" , namespace = "")
    private String arg1;
    @XmlElement(name = "arg2" , namespace = "")
    private String arg2;

    public int getArg0() {
        return this.arg0;
    }

    public String getArg1() {
        return this.arg1;
    }

    public String getArg2() {
        return this.arg2;
    }

    public void setArg0(int arg0) {
        this.arg0 = arg0;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

}
