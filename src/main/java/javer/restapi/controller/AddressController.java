package javer.restapi.controller;

import javer.restapi.dto.AddressDto;
import javer.restapi.service.AddressService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

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

    @GET
    @Path("/list")
    public List<AddressDto> getAll() {
        return addressService.getAll();
    }

    @GET
    @Path("/{state}")
    public List<AddressDto> getByState(@PathParam("state") String state) {
        return addressService.getByState(state);
    }

    @GET
    @Path("/{city}")
    public List<AddressDto> getByCity(@PathParam("city") String city) {
        return addressService.getByCity(city);
    }

    @GET
    @Path("/{zip}")
    public List<AddressDto> getByZip(@PathParam("zip") String zip) {
        return addressService.getByZip(zip);
    }

}
