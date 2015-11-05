import java.util.List;

import javax.activation.DataHandler;

import clientMTOM.SkiImageService;
import clientMTOM.SkiImageServiceService;

public class SkiImageClient {
    private static void dump(DataHandler dh) {
        try {
            System.out.println("MIME type: " + dh.getContentType());
            System.out.println("Content:   " + dh.getContent());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        SkiImageService port = new SkiImageServiceService().getSkiImageServicePort();
        DataHandler image = port.getImage("nordic");
        SkiImageClient.dump(image);
        List<DataHandler> images = port.getImages();
        for (DataHandler dh : images)
            SkiImageClient.dump(dh);
    }
}