package echoClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _Echo_QNAME = new QName("http://mctx/" , "echo");
    private final static QName _EchoResponse_QNAME = new QName("http://mctx/" , "echoResponse");

    public ObjectFactory() {
    }

    @XmlElementDecl(namespace = "http://mctx/" , name = "echo")
    public JAXBElement<Echo_Type> createEcho(Echo_Type value) {
        return new JAXBElement<Echo_Type>(ObjectFactory._Echo_QNAME , Echo_Type.class , null , value);
    }

    public Echo_Type createEcho_Type() {
        return new Echo_Type();
    }

    public EchoResponse createEchoResponse() {
        return new EchoResponse();
    }

    @XmlElementDecl(namespace = "http://mctx/" , name = "echoResponse")
    public JAXBElement<EchoResponse> createEchoResponse(EchoResponse value) {
        return new JAXBElement<EchoResponse>(ObjectFactory._EchoResponse_QNAME , EchoResponse.class , null , value);
    }

}
