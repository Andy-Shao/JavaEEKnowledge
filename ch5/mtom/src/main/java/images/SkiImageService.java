package images;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(wsdlLocation = "mtom.wsdl")
@BindingType(value = SOAPBinding.SOAP11HTTP_MTOM_BINDING)
// optional
public class SkiImageService {
    private Map<String , String> photos;

    public SkiImageService() {
        this.photos = new HashMap<String , String>();
        this.photos.put("nordic" , "nordic.jpg");
        this.photos.put("alpine" , "alpine.jpg");
        this.photos.put("telemk" , "telemk.jpg");
    }

    @SuppressWarnings("rawtypes")
    private Image createImage(String name) {
        String fileName = this.photos.get(name);
        byte[] bytes = this.getRawBytes(fileName);
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        Iterator iterators = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader iterator = (ImageReader) iterators.next();
        Image image = null;
        try {
            ImageInputStream iis = ImageIO.createImageInputStream(in);
            iterator.setInput(iis , true);
            image = iterator.read(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return image;
    }

    private List<Image> createImageList() {
        List<Image> list = new ArrayList<Image>();
        for (String key : this.photos.keySet()) {
            Image image = this.createImage(key);
            if (image != null) list.add(image);
        }
        return list;
    }

    @WebMethod
    public Image getImage(String name) {
        return this.createImage(name);
    }

    @WebMethod
    public List<Image> getImages() {
        return this.createImageList();
    }

    private byte[] getRawBytes(String fileName) {
        if (fileName == null) fileName = "nordic.jpg";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);

            byte[] buffer = new byte[2048];
            int n = 0;
            while ((n = in.read(buffer)) != -1)
                out.write(buffer , 0 , n); // append to array
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return out.toByteArray();
    }
}