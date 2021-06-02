package com.example.jaxrsdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public interface HelloController {

    @Path("/")
    @GET
    Response sayHello(@QueryParam("name") String name);
}
