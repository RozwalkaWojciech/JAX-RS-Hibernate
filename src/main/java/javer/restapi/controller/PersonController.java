package javer.restapi.controller;

import javer.restapi.dto.PersonDto;
import javer.restapi.service.PersonService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

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

    @PUT
    @Path("/{id}")
    public PersonDto update(@PathParam("id") Integer id, PersonDto personDto) {
        return personService.update(id, personDto);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Integer id) {
        personService.delete(id);
    }

    @GET
    @Path("/list")
    public List<PersonDto> getAll() {
        return personService.getAll();
    }

}
