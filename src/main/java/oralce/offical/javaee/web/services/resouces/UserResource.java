package oralce.offical.javaee.web.services.resouces;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/users/{username: [a-zA-Z]*}")
public class UserResource {

    @GET
    @Produces("text/plain")
    public String getUser(@DefaultValue("anon") @PathParam("username") String userName) {
        return "This is " + userName;
    }
}
