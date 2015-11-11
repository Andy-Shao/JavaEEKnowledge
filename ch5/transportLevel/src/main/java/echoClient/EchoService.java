package echoClient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "EchoService" , targetNamespace = "http://mctx/" ,
    wsdlLocation = "http://localhost:7777/echo?wsdl")
public class EchoService extends Service {

    private final static WebServiceException ECHOSERVICE_EXCEPTION;
    private final static QName ECHOSERVICE_QNAME = new QName("http://mctx/" , "EchoService");
    private final static URL ECHOSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7777/echo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ECHOSERVICE_WSDL_LOCATION = url;
        ECHOSERVICE_EXCEPTION = e;
    }

    private static URL __getWsdlLocation() {
        if (EchoService.ECHOSERVICE_EXCEPTION != null) throw EchoService.ECHOSERVICE_EXCEPTION;
        return EchoService.ECHOSERVICE_WSDL_LOCATION;
    }

    public EchoService() {
        super(EchoService.__getWsdlLocation() , EchoService.ECHOSERVICE_QNAME);
    }

    public EchoService(URL wsdlLocation) {
        super(wsdlLocation , EchoService.ECHOSERVICE_QNAME);
    }

    public EchoService(URL wsdlLocation , QName serviceName) {
        super(wsdlLocation , serviceName);
    }

    public EchoService(URL wsdlLocation , QName serviceName , WebServiceFeature... features) {
        super(wsdlLocation , serviceName , features);
    }

    public EchoService(URL wsdlLocation , WebServiceFeature... features) {
        super(wsdlLocation , EchoService.ECHOSERVICE_QNAME , features);
    }

    public EchoService(WebServiceFeature... features) {
        super(EchoService.__getWsdlLocation() , EchoService.ECHOSERVICE_QNAME , features);
    }

    @WebEndpoint(name = "EchoPort")
    public Echo getEchoPort() {
        return super.getPort(new QName("http://mctx/" , "EchoPort") , Echo.class);
    }

    @WebEndpoint(name = "EchoPort")
    public Echo getEchoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mctx/" , "EchoPort") , Echo.class , features);
    }

}
