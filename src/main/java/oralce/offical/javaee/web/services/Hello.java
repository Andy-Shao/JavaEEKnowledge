package oralce.offical.javaee.web.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Hello {

	private String message = new String("Hello, ");
	public Hello() {}
	
	@WebMethod
	public String sayHello(String name){
		return message + name + ".";
	}
	
	/**
	 * wsimport -keep -p oralce.offical.javaee.web.services.client http://localhost:8081/WebService/HelloService?wsdl
	 * @param args input
	 */
	public static void main(String[] args) {
	
		Endpoint.publish("http://localhost:8081/WebService/HelloService", new Hello());
		System.out.println("is Success?");
	}
}
