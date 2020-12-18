package javer.restapi.service;

import javer.restapi.dao.Dao;
import javer.restapi.dao.PersonDao;
import javer.restapi.dto.PersonDto;
import javer.restapi.mapper.PersonMapper;
import javer.restapi.model.Person;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@RequestScoped
@Transactional
public class PersonService {

    @Inject
    Dao<Person> personDao;

    public PersonDto save(PersonDto personDto) {
        return PersonMapper.personToDto(personDao.save(PersonMapper.dtoToPerson(personDto)));
    }

}
