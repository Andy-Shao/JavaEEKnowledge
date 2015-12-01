package service;

import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;

@SuppressWarnings("restriction")
public class TestService implements IService {
    @Override
    public void doDelete(HttpExchange e) {
        this.respond2Client(e , "doDelete");
    }

    @Override
    public void doGet(HttpExchange e) {
        this.respond2Client(e , "doGet");
    }

    @Override
    public void doPost(HttpExchange e) {
        this.respond2Client(e , "doPost");
    }

    @Override
    public void doPut(HttpExchange e) {
        this.respond2Client(e , "doPut");
    }

    private void respond2Client(HttpExchange ex , String response) {
        try {
            ex.sendResponseHeaders(200 , 0); // 0 == as many bytes as there are
            OutputStream out = ex.getResponseBody();
            out.write(response.getBytes());
            out.close(); // effectively ends session
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
