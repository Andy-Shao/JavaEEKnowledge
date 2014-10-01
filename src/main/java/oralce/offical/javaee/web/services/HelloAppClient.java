package oralce.offical.javaee.web.services;

import javax.xml.ws.WebServiceRef;

import oralce.offical.javaee.web.services.client.HelloService;

@Deprecated
public class HelloAppClient {
    @WebServiceRef(wsdlLocation="http://localhost:8081/WebService/HelloService.wsdl")
    private static HelloService helloService;
    
    public static void main(String[] args) {
        oralce.offical.javaee.web.services.client.Hello port = helloService.getHelloPort();
        port.sayHello("Andy-Shao");
    }
}
