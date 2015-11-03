package clientSOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerbosityException" , propOrder = { "faultInfo" , "message" })
public class VerbosityException {

    protected String faultInfo;
    protected String message;

    public String getFaultInfo() {
        return this.faultInfo;
    }

    public String getMessage() {
        return this.message;
    }

    public void setFaultInfo(String value) {
        this.faultInfo = value;
    }

    public void setMessage(String value) {
        this.message = value;
    }

}
