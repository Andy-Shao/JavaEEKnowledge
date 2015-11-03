package clientSOAP;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "PredictionsSOAPService" , targetNamespace = "http://predictions/" ,
    wsdlLocation = "http://localhost:8080/soap?wsdl")
public class PredictionsSOAPService extends Service {

    private final static WebServiceException PREDICTIONSSOAPSERVICE_EXCEPTION;
    private final static QName PREDICTIONSSOAPSERVICE_QNAME = new QName("http://predictions/" ,
        "PredictionsSOAPService");
    private final static URL PREDICTIONSSOAPSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/soap?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PREDICTIONSSOAPSERVICE_WSDL_LOCATION = url;
        PREDICTIONSSOAPSERVICE_EXCEPTION = e;
    }

    private static URL __getWsdlLocation() {
        if (PredictionsSOAPService.PREDICTIONSSOAPSERVICE_EXCEPTION != null) throw PredictionsSOAPService.PREDICTIONSSOAPSERVICE_EXCEPTION;
        return PredictionsSOAPService.PREDICTIONSSOAPSERVICE_WSDL_LOCATION;
    }

    public PredictionsSOAPService() {
        super(PredictionsSOAPService.__getWsdlLocation() , PredictionsSOAPService.PREDICTIONSSOAPSERVICE_QNAME);
    }

    public PredictionsSOAPService(URL wsdlLocation) {
        super(wsdlLocation , PredictionsSOAPService.PREDICTIONSSOAPSERVICE_QNAME);
    }

    public PredictionsSOAPService(URL wsdlLocation , QName serviceName) {
        super(wsdlLocation , serviceName);
    }

    public PredictionsSOAPService(URL wsdlLocation , QName serviceName , WebServiceFeature... features) {
        super(wsdlLocation , serviceName , features);
    }

    public PredictionsSOAPService(URL wsdlLocation , WebServiceFeature... features) {
        super(wsdlLocation , PredictionsSOAPService.PREDICTIONSSOAPSERVICE_QNAME , features);
    }

    public PredictionsSOAPService(WebServiceFeature... features) {
        super(
            PredictionsSOAPService.__getWsdlLocation() , PredictionsSOAPService.PREDICTIONSSOAPSERVICE_QNAME , features);
    }

    @WebEndpoint(name = "PredictionsSOAPPort")
    public PredictionsSOAP getPredictionsSOAPPort() {
        return super.getPort(new QName("http://predictions/" , "PredictionsSOAPPort") , PredictionsSOAP.class);
    }

    @WebEndpoint(name = "PredictionsSOAPPort")
    public PredictionsSOAP getPredictionsSOAPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://predictions/" , "PredictionsSOAPPort") , PredictionsSOAP.class ,
            features);
    }

}
