package oralce.offical.javaee.web.services;

import oralce.offical.javaee.web.services.client.HelloService;

public class HelloTest {
	public static void main(String[] args) {
		HelloService mss = new HelloService();
		oralce.offical.javaee.web.services.client.Hello ms = mss.getHelloPort();
		System.out.println(ms.sayHello("Andy Shao"));
	}

}
