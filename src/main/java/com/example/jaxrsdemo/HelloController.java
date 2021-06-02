package com.example.jaxrsdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public interface HelloController {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    Response sayHello(@QueryParam("name") String name);
}
