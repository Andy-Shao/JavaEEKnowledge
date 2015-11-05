package clientMTOM;

import java.util.List;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "SkiImageService" , targetNamespace = "http://images/")
@XmlSeeAlso({ ObjectFactory.class })
public interface SkiImageService {

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getImage" , targetNamespace = "http://images/" , className = "clientMTOM.GetImage")
    @ResponseWrapper(localName = "getImageResponse" , targetNamespace = "http://images/" ,
        className = "clientMTOM.GetImageResponse")
    public DataHandler getImage(@WebParam(name = "arg0" , targetNamespace = "") String arg0);

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getImages" , targetNamespace = "http://images/" , className = "clientMTOM.GetImages")
    @ResponseWrapper(localName = "getImagesResponse" , targetNamespace = "http://images/" ,
        className = "clientMTOM.GetImagesResponse")
    public List<DataHandler> getImages();

}
