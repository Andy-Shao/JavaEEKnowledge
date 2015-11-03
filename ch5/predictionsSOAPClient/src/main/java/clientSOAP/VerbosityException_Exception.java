package clientSOAP;

import javax.xml.ws.WebFault;

@SuppressWarnings("serial")
@WebFault(name = "VerbosityException" , targetNamespace = "http://predictions/")
public class VerbosityException_Exception extends Exception {
    private VerbosityException faultInfo;

    public VerbosityException_Exception(String message , VerbosityException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public VerbosityException_Exception(String message , VerbosityException faultInfo , Throwable cause) {
        super(message , cause);
        this.faultInfo = faultInfo;
    }

    public VerbosityException getFaultInfo() {
        return this.faultInfo;
    }

}
