package oralce.offical.javaee.web.services.resouces;

import java.util.List;

import javax.ws.rs.CookieParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.UriInfo;

import com.github.andyshao.convert.Convert;

//The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorldResource {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	// The Java method will process HTTP GET requests
	@GET
	@POST
	// The Java method will produce context identified by the MIME Media type
	// "text/plain"
	@Produces("text/plain")
	public String getClichedmessage() {
		return "Hello World";
	}

	@GET
	@POST
	@Path("{id}")
	@Produces("text/plain")
	public String getPath(@PathParam("id") int id) {
		return Convert.OB_2_STR.convert(id);
	}

	@GET
	@POST
	@Path("/customers/{first}-{last}")
	@Produces("text/plain")
	public String getCoustom(String firstName, String lastName) {
		return new StringBuilder().append("the first name is:").append(firstName).append(LINE_SEPARATOR).append("the lastname is:").append(lastName)
				.append(LINE_SEPARATOR).toString();
	}

	@GET
	@POST
	@Path("/cars/{model}")
	@Produces("text/plain")
	public String takePathSegment(@PathParam("model") PathSegment car) {
		return car.getPath();
	}

	@GET
	@POST
	@Path("/multiParam/{model : .+}")
	@Produces("text/plain")
	public String multiParam(@PathParam("model") List<PathSegment> model) {
		return "";
	}

	@GET
	@POST
	@Path("/uriInfo")
	@Produces("text/plain")
	public String getPath(@Context UriInfo info) {
		return info.getPath();
	}

	@GET
	@POST
	@Path("/matrixParam")
	@Produces("text/plain")
	public String matrixParam(@MatrixParam("color") String color) {
		// /mercedes/e55;color=black/2006/interior;color=tan
		return color;
	}

	/**
	 * <blockquote><pre>
	 * @GET  
	 * @Produces("application/xml")  
	 * public String getCustomers(@Context UriInfo info) {  
	 * 	   String start = info.getQueryParameters().getFirst("start");  
	 *     String size = info.getQueryParameters().getFirst("size");  
	 *     ...  
	 * }
	 * </pre></blockquote>
	 * @param start start param
	 * @param size end param
	 * @return the result
	 */
	@GET
	@POST
	@Path("/queryParam")
	@Produces("text/plain")
	public String queryParam(@QueryParam("start") int start, @QueryParam("size") int size) {
		// /customers?start=0&size=10
		return Convert.OB_2_STR.convert(start);
	}
	
	@GET
	@POST
	@Path("/formParam")
	@Produces("text/plain")
	public String formParam(@FormParam("firstname")String firstname){
		/*use for form:
		 * <FORM action="http://example.com/customers" method="post">  
		 * <P>  
		 * First name: <INPUT type="text" name="firstname"><BR>  
		 * Last name: <INPUT type="text" name="lastname"><BR>  
		 * <INPUT type="submit" value="Send">  
		 * </P>  
		 * </FORM>*/
		return "";
	}
	
	@GET
	@POST
	@Path("/headerParam")
	@Produces("text/html")
	public String headerParam(@HeaderParam("Referer") String referer){
		return "";
	}
	
	@GET
	@POST
	@Path("/httpHeader")
	@Produces("text/html")
	public String httpHeader(@Context HttpHeaders headers){
		headers.getRequestHeader("Referer").get(0);
		return "";
	}
	
	@GET
	@POST
	@Path("/cookieParam")
	@Produces("text/html")
	public String cookieParam(@CookieParam("customerId")int custId){
		return Convert.OB_2_STR.convert(custId);
	}
	
	@GET
	@POST
	@Path("/cookie")
	@Produces("text/html")
	public String cookie(@Context Cookie cookie){
		return "";
	}
}
