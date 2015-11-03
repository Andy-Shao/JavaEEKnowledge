package predictions.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "VerbosityException" , namespace = "http://predictions/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerbosityException" , namespace = "http://predictions/" , propOrder = { "faultInfo" , "message" })
public class VerbosityExceptionBean {

    private String faultInfo;
    private String message;

    public String getFaultInfo() {
        return this.faultInfo;
    }

    public String getMessage() {
        return this.message;
    }

    public void setFaultInfo(String faultInfo) {
        this.faultInfo = faultInfo;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
