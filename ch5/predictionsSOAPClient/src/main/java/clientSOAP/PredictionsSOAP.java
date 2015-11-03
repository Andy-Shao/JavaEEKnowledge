package clientSOAP;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "PredictionsSOAP" , targetNamespace = "http://predictions/")
@XmlSeeAlso({ ObjectFactory.class })
public interface PredictionsSOAP {

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "create" , targetNamespace = "http://predictions/" , className = "clientSOAP.Create")
    @ResponseWrapper(localName = "createResponse" , targetNamespace = "http://predictions/" ,
        className = "clientSOAP.CreateResponse")
    @Action(input = "http://predictions/PredictionsSOAP/createRequest" ,
        output = "http://predictions/PredictionsSOAP/createResponse" , fault = { @FaultAction(
            className = VerbosityException_Exception.class ,
            value = "http://predictions/PredictionsSOAP/create/Fault/VerbosityException") })
    public String create(@WebParam(name = "arg0" , targetNamespace = "") String arg0 , @WebParam(name = "arg1" ,
        targetNamespace = "") String arg1) throws VerbosityException_Exception;

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete" , targetNamespace = "http://predictions/" , className = "clientSOAP.Delete")
    @ResponseWrapper(localName = "deleteResponse" , targetNamespace = "http://predictions/" ,
        className = "clientSOAP.DeleteResponse")
    @Action(input = "http://predictions/PredictionsSOAP/deleteRequest" ,
        output = "http://predictions/PredictionsSOAP/deleteResponse")
    public String delete(@WebParam(name = "arg0" , targetNamespace = "") int arg0);

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "edit" , targetNamespace = "http://predictions/" , className = "clientSOAP.Edit")
    @ResponseWrapper(localName = "editResponse" , targetNamespace = "http://predictions/" ,
        className = "clientSOAP.EditResponse")
    @Action(input = "http://predictions/PredictionsSOAP/editRequest" ,
        output = "http://predictions/PredictionsSOAP/editResponse" , fault = { @FaultAction(
            className = VerbosityException_Exception.class ,
            value = "http://predictions/PredictionsSOAP/edit/Fault/VerbosityException") })
    public String edit(@WebParam(name = "arg0" , targetNamespace = "") int arg0 , @WebParam(name = "arg1" ,
        targetNamespace = "") String arg1 , @WebParam(name = "arg2" , targetNamespace = "") String arg2)
        throws VerbosityException_Exception;

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAll" , targetNamespace = "http://predictions/" , className = "clientSOAP.GetAll")
    @ResponseWrapper(localName = "getAllResponse" , targetNamespace = "http://predictions/" ,
        className = "clientSOAP.GetAllResponse")
    @Action(input = "http://predictions/PredictionsSOAP/getAllRequest" ,
        output = "http://predictions/PredictionsSOAP/getAllResponse")
    public List<Prediction> getAll();

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOne" , targetNamespace = "http://predictions/" , className = "clientSOAP.GetOne")
    @ResponseWrapper(localName = "getOneResponse" , targetNamespace = "http://predictions/" ,
        className = "clientSOAP.GetOneResponse")
    @Action(input = "http://predictions/PredictionsSOAP/getOneRequest" ,
        output = "http://predictions/PredictionsSOAP/getOneResponse")
    public Prediction getOne(@WebParam(name = "arg0" , targetNamespace = "") int arg0);

}
