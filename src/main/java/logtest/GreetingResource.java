package logtest;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Slf4j
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/log1")
    public String log1() {
        log.info("info log1");
        log.info("info log2");
        log.info("info log3");
        return "Hello RESTEasy";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/log2")
    public String log2() {
        log.error("error log1");
        log.error("error log2");
        log.error("error log3");
        return "Hello RESTEasy";
    }
}