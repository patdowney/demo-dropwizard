package name.patdowney.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/current-time")
@Produces(MediaType.APPLICATION_JSON)
public class DemoResource {
    public DemoResource() {}

    @GET
    public CurrentTime getCurrentTime() {
        return new CurrentTime();
    }
}