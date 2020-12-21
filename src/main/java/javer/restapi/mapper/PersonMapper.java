package javer.restapi.mapper;

import javer.restapi.dto.PersonDto;
import javer.restapi.model.Person;

public class PersonMapper {

    public static Person dtoToPerson(PersonDto personDto) {
        Person person = new Person();
        person.setName(personDto.getName());
        person.setLastName(personDto.getLastName());
        person.setPesel(personDto.getPesel());
        person.setAddress(AddressMapper.dtoToAddress(personDto.getAddress()));
        return person;
    }

    public static PersonDto personToDto(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setId(person.getId());
        personDto.setName(person.getName());
        personDto.setLastName(person.getLastName());
        personDto.setPesel(person.getPesel());
        personDto.setAddress(AddressMapper.addressToDto(person.getAddress()));
        return personDto;
    }

}
