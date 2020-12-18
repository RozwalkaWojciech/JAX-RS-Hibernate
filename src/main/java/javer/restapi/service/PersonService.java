package javer.restapi.service;

import javer.restapi.dao.PersonDao;
import javer.restapi.dto.PersonDto;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class PersonService {

    @Inject
    PersonDao personDao;

    public PersonDto save(PersonDto personDto) {
        return personDao.save(personDto);
    }

}
