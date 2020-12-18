package javer.restapi.dao;

import javer.restapi.model.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PersonDao implements Dao<Person> {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Person save(Person person) {
        entityManager.persist(person);
        return person;
    }

    @Override
    public Person get(Integer id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public Person update(Integer id, Person person) {
        Person personToUpdate = get(id);
        if (personToUpdate != null) {
            personToUpdate.setName(person.getName());
            personToUpdate.setLastName(person.getLastName());
            personToUpdate.setPesel(person.getPesel());
            return entityManager.merge(personToUpdate);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        entityManager.remove(get(id));
    }

    @Override
    public List<Person> getAll() {
        return entityManager.createQuery("select p from Person p", Person.class).getResultList();
    }
}
