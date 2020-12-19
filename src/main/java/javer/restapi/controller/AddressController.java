package javer.restapi.controller;

import javer.restapi.dto.AddressDto;
import javer.restapi.service.AddressService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/address")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AddressController {

    @Inject
    AddressService addressService;

    @POST
    public AddressDto save(AddressDto addressDto) {
        return addressService.save(addressDto);
    }

    @GET
    @Path("/{id}")
    public AddressDto getAddress(@PathParam("id") Integer id) {
        return addressService.get(id);
    }

    @PUT
    @Path("/{id}")
    public AddressDto update(@PathParam("id") Integer id, AddressDto addressDto) {
        return addressService.update(id, addressDto);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Integer id) {
        addressService.delete(id);
    }
}
