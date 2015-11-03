package clientSOAP;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class ClientHandlerResolver implements HandlerResolver {
    private String key;
    private String name;

    public ClientHandlerResolver(String name , String key) {
        this.key = key;
        this.name = name;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlerChain = new ArrayList<>();
        handlerChain.add(new ClientHashHandler(this.name , this.key));
        return handlerChain;
    }

}
