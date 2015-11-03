package clientSOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create" , propOrder = { "arg0" , "arg1" })
public class Create {

    protected String arg0;
    protected String arg1;

    public String getArg0() {
        return this.arg0;
    }

    public String getArg1() {
        return this.arg1;
    }

    public void setArg0(String value) {
        this.arg0 = value;
    }

    public void setArg1(String value) {
        this.arg1 = value;
    }

}
