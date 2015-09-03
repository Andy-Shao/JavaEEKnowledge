package adages;

import java.net.InetSocketAddress;

import javax.ws.rs.ext.RuntimeDelegate;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

/* Standalone Java application to publish the 'adages' JAX-RS service.
 This is an alternative, typically for development, to publishing with
 a web server such as Tomcat or Jetty. */
@SuppressWarnings("restriction")
public class AdagesPublisher {
    private static final int port = 9876;
    private static final String uri = "/resourcesA/";
    private static final String url = "http://localhost:" + AdagesPublisher.port + AdagesPublisher.uri;

    public static void main(String[] args) {
        new AdagesPublisher().publish();
    }

    private HttpServer getServer() {
        HttpServer server = null;
        int backlog = 8;
        try {
            server = HttpServer.create(new InetSocketAddress("localhost" , AdagesPublisher.port) , backlog);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return server;
    }

    private void msg(HttpServer server) {
        String out = "Publishing RestfulAdage on " + AdagesPublisher.url + ". Hit any key to stop.";
        System.out.println(out);
        try {
            System.in.read();
        } catch (Exception e) {
        }

        server.stop(0); // normal termination
    }

    private void publish() {
        HttpServer server = this.getServer();
        HttpHandler requestHandler =
            RuntimeDelegate.getInstance().createEndpoint(new RestfulAdage() , HttpHandler.class);
        server.createContext(AdagesPublisher.uri , requestHandler);
        server.start();
        this.msg(server);
    }
}
