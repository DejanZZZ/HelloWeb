package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/test")
public class TestResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Ciao!";
    }
}
