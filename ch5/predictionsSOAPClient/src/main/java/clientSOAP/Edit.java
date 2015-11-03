package clientSOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edit" , propOrder = { "arg0" , "arg1" , "arg2" })
public class Edit {

    protected int arg0;
    protected String arg1;
    protected String arg2;

    public int getArg0() {
        return this.arg0;
    }

    public String getArg1() {
        return this.arg1;
    }

    public String getArg2() {
        return this.arg2;
    }

    public void setArg0(int value) {
        this.arg0 = value;
    }

    public void setArg1(String value) {
        this.arg1 = value;
    }

    public void setArg2(String value) {
        this.arg2 = value;
    }

}
