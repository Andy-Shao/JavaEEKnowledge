package clientMTOM;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "SkiImageServiceService" , targetNamespace = "http://images/" ,
    wsdlLocation = "http://localhost:9876/ski?wsdl")
public class SkiImageServiceService extends Service {

    private final static Logger logger = Logger.getLogger(clientMTOM.SkiImageServiceService.class.getName());
    private final static URL SKIIMAGESERVICESERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = clientMTOM.SkiImageServiceService.class.getResource(".");
            url = new URL(baseUrl , "http://localhost:9876/ski?wsdl");
        } catch (MalformedURLException e) {
            SkiImageServiceService.logger
                .warning("Failed to create URL for the wsdl Location: 'http://localhost:9876/ski?wsdl', retrying as a local file");
            SkiImageServiceService.logger.warning(e.getMessage());
        }
        SKIIMAGESERVICESERVICE_WSDL_LOCATION = url;
    }

    public SkiImageServiceService() {
        super(SkiImageServiceService.SKIIMAGESERVICESERVICE_WSDL_LOCATION , new QName("http://images/" ,
            "SkiImageServiceService"));
    }

    public SkiImageServiceService(URL wsdlLocation , QName serviceName) {
        super(wsdlLocation , serviceName);
    }

    @WebEndpoint(name = "SkiImageServicePort")
    public SkiImageService getSkiImageServicePort() {
        return super.getPort(new QName("http://images/" , "SkiImageServicePort") , SkiImageService.class);
    }

    @WebEndpoint(name = "SkiImageServicePort")
    public SkiImageService getSkiImageServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://images/" , "SkiImageServicePort") , SkiImageService.class , features);
    }

}
