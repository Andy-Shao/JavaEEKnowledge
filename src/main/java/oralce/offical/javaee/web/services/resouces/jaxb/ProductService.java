package oralce.offical.javaee.web.services.resouces.jaxb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/product")
public class ProductService {

	@GET
	@Path("/get")
	@Produces("application/xml")
	public Product getProduct(){
		Product prod = new Product();
		prod.setId(1);
		prod.setName("Mattress");
		prod.setDescription("Queen size mattress");
		prod.setPrice(500);
		return prod;
	}
}
