import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.KeyStore;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManagerFactory;

public class HttpsClient {
    private static final String endpoint = "https://localhost:3443/test/";
    private static final String truststore = "test.keystore";

    public static void main(String[] args) {
        new HttpsClient().runTests();
    }

    private void deleteTest(HttpsURLConnection conn) {
        try {
            conn.connect();
            this.readResponse("PUT request: " , conn);
            conn.disconnect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private HttpsURLConnection getConnection(URL url , String verb) {
        try {
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestMethod(verb);

            // Guard against "bad hostname" errors during handshake.
            conn.setHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String host , SSLSession session) {
                    return host.equals("localhost"); // for development
                }
            });
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void getTest(HttpsURLConnection conn) {
        try {
            conn.connect();
            this.readResponse("GET request: " , conn);
            conn.disconnect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void postTest(HttpsURLConnection conn) {
        try {
            conn.connect();
            this.writeBody(conn);
            this.readResponse("POST request: " , conn);
            conn.disconnect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void putTest(HttpsURLConnection conn) {
        try {
            conn.connect();
            this.writeBody(conn);
            this.readResponse("PUT request: " , conn);
            conn.disconnect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void readResponse(String msg , HttpsURLConnection conn) {
        try {
            byte[] buffer = new byte[512]; // plenty for testing
            InputStream in = conn.getInputStream();
            in.read(buffer);
            System.out.println(msg + new String(buffer));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void runTests() {
        try {
            SSLContext sslCtx = SSLContext.getInstance("TLS");

            // password for truststore (same as server's keystore)
            char[] password = "qubits".toCharArray();
            KeyStore ks = KeyStore.getInstance("JKS");
            InputStream fis =
                Thread.currentThread().getContextClassLoader().getResourceAsStream(HttpsClient.truststore);
            ks.load(fis , password);
            TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
            tmf.init(ks); // same as keystore
            sslCtx.init(null , // not needed, not challenged
                tmf.getTrustManagers() , null); // use default: SecureRandom

            HttpsURLConnection.setDefaultSSLSocketFactory(sslCtx.getSocketFactory());
            URL url = new URL(HttpsClient.endpoint);

            HttpsURLConnection conn = this.getConnection(url , "GET");
            this.getTest(conn);
            conn = this.getConnection(url , "POST");
            this.postTest(conn);
            conn = this.getConnection(url , "PUT");
            this.putTest(conn);
            conn = this.getConnection(url , "DELETE");
            this.deleteTest(conn);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void writeBody(HttpsURLConnection conn) {
        try {
            OutputStream out = conn.getOutputStream();
            out.write("foo bar baz".getBytes()); // anything will do
            out.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
