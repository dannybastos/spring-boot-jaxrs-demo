package com.example.jaxrsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;

public class HelloControllerImpl implements HelloController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public Response sayHello(String name) {
        log.info(String.format("name=%s", name));
        return Response.ok(String.format("Hello, %s", name)).build();
    }
}
