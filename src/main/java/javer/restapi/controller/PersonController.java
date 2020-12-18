package javer.restapi.controller;

import javer.restapi.dto.PersonDto;
import javer.restapi.service.PersonService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonController {

    @Inject
    PersonService personService;

    @POST
    public PersonDto save(PersonDto personDto) {
        return personService.save(personDto);
    }

    @GET
    @Path("/{id}")
    public PersonDto getPerson(@PathParam("id") Integer id) {
        return personService.get(id);
    }

}
