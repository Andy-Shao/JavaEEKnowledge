package oralce.offical.javaee.web.services.resouces;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorldResource {

	//The Java method will process HTTP GET requests
	@GET
	//The Java method will produce context identified by the MIME Media type "text/plain"
	@Produces("text/plain")
	public String getClichedmessage() {
		return "Hello World";
	}
}
