package javer.restapi.mapper;

import javer.restapi.dto.AddressDto;
import javer.restapi.model.Address;

public class AddressMapper {

    private AddressMapper() {
    }

    public static Address dtoToAddress(AddressDto addressDto) {
        Address address = new Address();
        address.setState(addressDto.getState());
        address.setZip(addressDto.getZip());
        address.setCity(addressDto.getCity());
        address.setStreet(addressDto.getStreet());
        address.setHouseNumber(addressDto.getHouseNumber());
        address.setApartmentNumber(addressDto.getApartmentNumber());
        return address;
    }

    public static AddressDto addressToDto(Address address) {
        AddressDto addressDto = new AddressDto();
        addressDto.setId(address.getId());
        addressDto.setState(address.getState());
        addressDto.setZip(address.getZip());
        addressDto.setCity(address.getCity());
        addressDto.setStreet(address.getStreet());
        addressDto.setHouseNumber(address.getHouseNumber());
        addressDto.setApartmentNumber(address.getApartmentNumber());
        return addressDto;
    }
}
