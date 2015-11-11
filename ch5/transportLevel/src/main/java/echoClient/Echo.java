package echoClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "Echo" , targetNamespace = "http://mctx/")
@XmlSeeAlso({ ObjectFactory.class })
public interface Echo {

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "echo" , targetNamespace = "http://mctx/" , className = "echoClient.Echo_Type")
    @ResponseWrapper(localName = "echoResponse" , targetNamespace = "http://mctx/" ,
        className = "echoClient.EchoResponse")
    @Action(input = "http://mctx/Echo/echoRequest" , output = "http://mctx/Echo/echoResponse")
    public String echo(@WebParam(name = "arg0" , targetNamespace = "") String arg0);

}
