package clientAsync;

import java.util.List;
import java.util.concurrent.Future;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


@WebService(name = "RandService" , targetNamespace = "http://rand/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RandService {

    
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "next1" , targetNamespace = "http://rand/" , className = "clientAsync.Next1")
    @ResponseWrapper(localName = "next1Response" , targetNamespace = "http://rand/" ,
        className = "clientAsync.Next1Response")
    public int next1();

    
    @WebMethod(operationName = "next1")
    @RequestWrapper(localName = "next1" , targetNamespace = "http://rand/" , className = "clientAsync.Next1")
    @ResponseWrapper(localName = "next1Response" , targetNamespace = "http://rand/" ,
        className = "clientAsync.Next1Response")
    public Response<Next1Response> next1Async();

    
    @WebMethod(operationName = "next1")
    @RequestWrapper(localName = "next1" , targetNamespace = "http://rand/" , className = "clientAsync.Next1")
    @ResponseWrapper(localName = "next1Response" , targetNamespace = "http://rand/" ,
        className = "clientAsync.Next1Response")
    public Future<?> next1Async(
        @WebParam(name = "asyncHandler" , targetNamespace = "") AsyncHandler<Next1Response> asyncHandler);

    
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nextN" , targetNamespace = "http://rand/" , className = "clientAsync.NextN")
    @ResponseWrapper(localName = "nextNResponse" , targetNamespace = "http://rand/" ,
        className = "clientAsync.NextNResponse")
    public List<Integer> nextN(@WebParam(name = "arg0" , targetNamespace = "") int arg0);

    
    @WebMethod(operationName = "nextN")
    @RequestWrapper(localName = "nextN" , targetNamespace = "http://rand/" , className = "clientAsync.NextN")
    @ResponseWrapper(localName = "nextNResponse" , targetNamespace = "http://rand/" ,
        className = "clientAsync.NextNResponse")
    public Response<NextNResponse> nextNAsync(@WebParam(name = "arg0" , targetNamespace = "") int arg0);

    
    @WebMethod(operationName = "nextN")
    @RequestWrapper(localName = "nextN" , targetNamespace = "http://rand/" , className = "clientAsync.NextN")
    @ResponseWrapper(localName = "nextNResponse" , targetNamespace = "http://rand/" ,
        className = "clientAsync.NextNResponse")
    public Future<?> nextNAsync(@WebParam(name = "arg0" , targetNamespace = "") int arg0 , @WebParam(
        name = "asyncHandler" , targetNamespace = "") AsyncHandler<NextNResponse> asyncHandler);

}
