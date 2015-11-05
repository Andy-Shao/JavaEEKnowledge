package clientMTOM;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _GetImage_QNAME = new QName("http://images/" , "getImage");
    private final static QName _GetImageResponse_QNAME = new QName("http://images/" , "getImageResponse");
    private final static QName _GetImages_QNAME = new QName("http://images/" , "getImages");
    private final static QName _GetImagesResponse_QNAME = new QName("http://images/" , "getImagesResponse");

    public ObjectFactory() {
    }

    public GetImage createGetImage() {
        return new GetImage();
    }

    @XmlElementDecl(namespace = "http://images/" , name = "getImage")
    public JAXBElement<GetImage> createGetImage(GetImage value) {
        return new JAXBElement<GetImage>(ObjectFactory._GetImage_QNAME , GetImage.class , null , value);
    }

    public GetImageResponse createGetImageResponse() {
        return new GetImageResponse();
    }

    @XmlElementDecl(namespace = "http://images/" , name = "getImageResponse")
    public JAXBElement<GetImageResponse> createGetImageResponse(GetImageResponse value) {
        return new JAXBElement<GetImageResponse>(ObjectFactory._GetImageResponse_QNAME , GetImageResponse.class , null ,
            value);
    }

    public GetImages createGetImages() {
        return new GetImages();
    }

    @XmlElementDecl(namespace = "http://images/" , name = "getImages")
    public JAXBElement<GetImages> createGetImages(GetImages value) {
        return new JAXBElement<GetImages>(ObjectFactory._GetImages_QNAME , GetImages.class , null , value);
    }

    public GetImagesResponse createGetImagesResponse() {
        return new GetImagesResponse();
    }

    @XmlElementDecl(namespace = "http://images/" , name = "getImagesResponse")
    public JAXBElement<GetImagesResponse> createGetImagesResponse(GetImagesResponse value) {
        return new JAXBElement<GetImagesResponse>(ObjectFactory._GetImagesResponse_QNAME , GetImagesResponse.class ,
            null , value);
    }

}
