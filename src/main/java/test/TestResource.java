package test;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import test.feign.FeignClient;


@Path("/test")
@Component
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {

    private static final Logger LOG = LoggerFactory.getLogger(TestResource.class);

    private FeignClient client;

    public TestResource(FeignClient client) {
        this.client = client;
    }

    @GET
    public String testFeignClients() {
        client.callAPI();
        return "Test Feign Clients";
    }

}
