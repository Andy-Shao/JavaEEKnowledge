package client;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(name = "RandService" , targetNamespace = "http://rand/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RandService {

    
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "next1" , targetNamespace = "http://rand/" , className = "client.Next1")
    @ResponseWrapper(localName = "next1Response" , targetNamespace = "http://rand/" ,
        className = "client.Next1Response")
    public int next1();

    
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nextN" , targetNamespace = "http://rand/" , className = "client.NextN")
    @ResponseWrapper(localName = "nextNResponse" , targetNamespace = "http://rand/" ,
        className = "client.NextNResponse")
    public List<Integer> nextN(@WebParam(name = "arg0" , targetNamespace = "") int arg0);

}
