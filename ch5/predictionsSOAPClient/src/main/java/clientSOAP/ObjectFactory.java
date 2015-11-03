package clientSOAP;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _Create_QNAME = new QName("http://predictions/" , "create");
    private final static QName _CreateResponse_QNAME = new QName("http://predictions/" , "createResponse");
    private final static QName _Delete_QNAME = new QName("http://predictions/" , "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://predictions/" , "deleteResponse");
    private final static QName _Edit_QNAME = new QName("http://predictions/" , "edit");
    private final static QName _EditResponse_QNAME = new QName("http://predictions/" , "editResponse");
    private final static QName _GetAll_QNAME = new QName("http://predictions/" , "getAll");
    private final static QName _GetAllResponse_QNAME = new QName("http://predictions/" , "getAllResponse");
    private final static QName _GetOne_QNAME = new QName("http://predictions/" , "getOne");
    private final static QName _GetOneResponse_QNAME = new QName("http://predictions/" , "getOneResponse");
    private final static QName _VerbosityException_QNAME = new QName("http://predictions/" , "VerbosityException");

    public ObjectFactory() {
    }

    public Create createCreate() {
        return new Create();
    }

    @XmlElementDecl(namespace = "http://predictions/" , name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(ObjectFactory._Create_QNAME , Create.class , null , value);
    }

    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    @XmlElementDecl(namespace = "http://predictions/" , name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(ObjectFactory._CreateResponse_QNAME , CreateResponse.class , null ,
            value);
    }

    public Delete createDelete() {
        return new Delete();
    }

    @XmlElementDecl(namespace = "http://predictions/" , name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(ObjectFactory._Delete_QNAME , Delete.class , null , value);
    }

    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    @XmlElementDecl(namespace = "http://predictions/" , name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(ObjectFactory._DeleteResponse_QNAME , DeleteResponse.class , null ,
            value);
    }

    public Edit createEdit() {
        return new Edit();
    }

    @XmlElementDecl(namespace = "http://predictions/" , name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(ObjectFactory._Edit_QNAME , Edit.class , null , value);
    }

    public EditResponse createEditResponse() {
        return new EditResponse();
    }

    @XmlElementDecl(namespace = "http://predictions/" , name = "editResponse")
    public JAXBElement<EditResponse> createEditResponse(EditResponse value) {
        return new JAXBElement<EditResponse>(ObjectFactory._EditResponse_QNAME , EditResponse.class , null , value);
    }

    public GetAll createGetAll() {
        return new GetAll();
    }

    @XmlElementDecl(namespace = "http://predictions/" , name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(ObjectFactory._GetAll_QNAME , GetAll.class , null , value);
    }

    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    @XmlElementDecl(namespace = "http://predictions/" , name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(ObjectFactory._GetAllResponse_QNAME , GetAllResponse.class , null ,
            value);
    }

    public GetOne createGetOne() {
        return new GetOne();
    }

    @XmlElementDecl(namespace = "http://predictions/" , name = "getOne")
    public JAXBElement<GetOne> createGetOne(GetOne value) {
        return new JAXBElement<GetOne>(ObjectFactory._GetOne_QNAME , GetOne.class , null , value);
    }

    public GetOneResponse createGetOneResponse() {
        return new GetOneResponse();
    }

    @XmlElementDecl(namespace = "http://predictions/" , name = "getOneResponse")
    public JAXBElement<GetOneResponse> createGetOneResponse(GetOneResponse value) {
        return new JAXBElement<GetOneResponse>(ObjectFactory._GetOneResponse_QNAME , GetOneResponse.class , null ,
            value);
    }

    public Prediction createPrediction() {
        return new Prediction();
    }

    public VerbosityException createVerbosityException() {
        return new VerbosityException();
    }

    @XmlElementDecl(namespace = "http://predictions/" , name = "VerbosityException")
    public JAXBElement<VerbosityException> createVerbosityException(VerbosityException value) {
        return new JAXBElement<VerbosityException>(ObjectFactory._VerbosityException_QNAME , VerbosityException.class ,
            null , value);
    }

}
