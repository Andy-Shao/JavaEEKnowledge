package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _Next1_QNAME = new QName("http://rand/" , "next1");
    private final static QName _Next1Response_QNAME = new QName("http://rand/" , "next1Response");
    private final static QName _NextN_QNAME = new QName("http://rand/" , "nextN");
    private final static QName _NextNResponse_QNAME = new QName("http://rand/" , "nextNResponse");

    
    public ObjectFactory() {
    }

    
    public Next1 createNext1() {
        return new Next1();
    }

    
    @XmlElementDecl(namespace = "http://rand/" , name = "next1")
    public JAXBElement<Next1> createNext1(Next1 value) {
        return new JAXBElement<Next1>(ObjectFactory._Next1_QNAME , Next1.class , null , value);
    }

    
    public Next1Response createNext1Response() {
        return new Next1Response();
    }

    
    @XmlElementDecl(namespace = "http://rand/" , name = "next1Response")
    public JAXBElement<Next1Response> createNext1Response(Next1Response value) {
        return new JAXBElement<Next1Response>(ObjectFactory._Next1Response_QNAME , Next1Response.class , null , value);
    }

    
    public NextN createNextN() {
        return new NextN();
    }

    
    @XmlElementDecl(namespace = "http://rand/" , name = "nextN")
    public JAXBElement<NextN> createNextN(NextN value) {
        return new JAXBElement<NextN>(ObjectFactory._NextN_QNAME , NextN.class , null , value);
    }

    
    public NextNResponse createNextNResponse() {
        return new NextNResponse();
    }

    
    @XmlElementDecl(namespace = "http://rand/" , name = "nextNResponse")
    public JAXBElement<NextNResponse> createNextNResponse(NextNResponse value) {
        return new JAXBElement<NextNResponse>(ObjectFactory._NextNResponse_QNAME , NextNResponse.class , null , value);
    }

}
