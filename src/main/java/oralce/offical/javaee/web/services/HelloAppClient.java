package oralce.offical.javaee.web.services;

import javax.xml.ws.WebServiceRef;

import oralce.offical.javaee.web.services.client.HelloService;

public class HelloAppClient {
    @WebServiceRef(wsdlLocation="http://localhost:8081/WebService/HelloService.wsdl")
    static HelloService helloService;
    
    public static void main(String[] args) {
        System.out.println(sayHello("world"));
     }

     private static String sayHello(java.lang.String arg0) {
    	 oralce.offical.javaee.web.services.client.Hello port = helloService.getHelloPort();
         return port.sayHello(arg0);
     }
}
