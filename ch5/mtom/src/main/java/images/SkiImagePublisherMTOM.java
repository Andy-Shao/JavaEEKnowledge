package images;

import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;

public class SkiImagePublisherMTOM {
    public static void main(String[] args) {
        SkiImagePublisherMTOM me = new SkiImagePublisherMTOM();
        me.createEndpoint();
        me.configureEndpoint();
        me.publish();
    }

    private Endpoint endpoint;

    private void configureEndpoint() {
        SOAPBinding binding = (SOAPBinding) this.endpoint.getBinding();
        binding.setMTOMEnabled(true);
    }

    private void createEndpoint() {
        this.endpoint = Endpoint.create(new SkiImageService());
    }

    private void publish() {
        int port = 9876;
        String url = "http://localhost:" + port + "/ski";
        this.endpoint.publish(url);
        System.out.println(url);
    }
}