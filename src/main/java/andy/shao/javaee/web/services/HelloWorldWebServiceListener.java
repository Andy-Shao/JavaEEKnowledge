package andy.shao.javaee.web.services;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.ws.Endpoint;

public class HelloWorldWebServiceListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		//do nothing...
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		HelloWorld helloWorld = new HelloWorldImpl();
		String address = "http://localhost:8081/WebService/HelloWorld";
		Endpoint.publish(address, helloWorld);
	}

}
