package javer.restapi.controller;

import javer.restapi.dto.PersonDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class PersonController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public PersonDto getPerson() {
        return null;
    }

}
