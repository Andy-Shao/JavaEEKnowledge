package client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


@WebServiceClient(name = "RandServiceService" , targetNamespace = "http://rand/" ,
    wsdlLocation = "http://localhost:8080/rs?wsdl")
public class RandServiceService extends Service {

    private final static Logger logger = Logger.getLogger(client.RandServiceService.class.getName());
    private final static URL RANDSERVICESERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = client.RandServiceService.class.getResource(".");
            url = new URL(baseUrl , "http://localhost:8080/rs?wsdl");
        } catch (MalformedURLException e) {
            RandServiceService.logger
                .warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/rs?wsdl', retrying as a local file");
            RandServiceService.logger.warning(e.getMessage());
        }
        RANDSERVICESERVICE_WSDL_LOCATION = url;
    }

    public RandServiceService() {
        super(RandServiceService.RANDSERVICESERVICE_WSDL_LOCATION , new QName("http://rand/" , "RandServiceService"));
    }

    public RandServiceService(URL wsdlLocation , QName serviceName) {
        super(wsdlLocation , serviceName);
    }

    
    @WebEndpoint(name = "RandServicePort")
    public RandService getRandServicePort() {
        return super.getPort(new QName("http://rand/" , "RandServicePort") , RandService.class);
    }

    
    @WebEndpoint(name = "RandServicePort")
    public RandService getRandServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://rand/" , "RandServicePort") , RandService.class , features);
    }

}
