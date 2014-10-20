package andy.shao.web.services;

import javax.xml.ws.Endpoint;

import andy.shao.javaee.web.services.HelloWorld;
import andy.shao.javaee.web.services.HelloWorldImpl;

public class Servers {

	public Servers() {
		HelloWorld helloWorld = new HelloWorldImpl();
		String address = "http://localhost:8081/WebService/HelloWorld";
		Endpoint.publish(address, helloWorld);
	}
	
	/**
	 * wsimport -keep -p oralce.offical.javaee.web.services.client http://localhost:8081/WebService/HelloWorld?wsdl
	 * @param args
	 */
	public static void main(String[] args) {
		new Servers();
		System.out.println("server start ...");
	}
}
