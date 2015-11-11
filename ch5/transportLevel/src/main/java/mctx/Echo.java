package mctx;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
@SuppressWarnings("rawtypes")
public class Echo {
    @Resource
    WebServiceContext wctx;

    private void dump(Map map , String indent) {
        Set keys = map.keySet();
        for (Object key : keys) {
            System.out.println(indent + key + " : " + map.get(key));
            if (map.get(key) instanceof Map) this.dump((Map) map.get(key) , indent += "  ");
        }
    }

    @WebMethod
    public String echo(String in) {
        String out = "Echoing: " + in;

        // Hit the transport level to extract the HTTP headers.
        MessageContext mctx = this.wctx.getMessageContext();
        Map requestHeaders = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        this.dump(requestHeaders , "");

        return out;
    }
}