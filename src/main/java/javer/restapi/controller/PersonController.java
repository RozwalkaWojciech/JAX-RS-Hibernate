package javer.restapi.controller;

import javer.restapi.dto.PersonDto;
import javer.restapi.service.PersonService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class PersonController {

    @Inject
    PersonService personService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public PersonDto save(PersonDto personDto){
        return personService.save(personDto);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public PersonDto getPerson() {
        return null;
    }

}
