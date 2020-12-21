package javer.restapi.dao;

import javer.restapi.model.Address;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class AddressDao implements AddressDaoInterface<Address> {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Address save(Address address) {
        entityManager.persist(address);
        return address;
    }

    @Override
    public Address get(Integer id) {
        return entityManager.find(Address.class, id);
    }

    @Override
    public Address update(Integer id, Address address) {
        Address addressToUpdate = get(id);
        if (addressToUpdate != null) {
            addressToUpdate.setState(address.getState());
            addressToUpdate.setZip(address.getZip());
            addressToUpdate.setCity(address.getCity());
            addressToUpdate.setStreet(address.getStreet());
            addressToUpdate.setHouseNumber(address.getHouseNumber());
            addressToUpdate.setApartmentNumber(address.getApartmentNumber());
            entityManager.merge(addressToUpdate);
            return addressToUpdate;
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        if (get(id) != null) {
            entityManager.remove(get(id));
        }
    }

    @Override
    public List<Address> getAll() {
        return entityManager.createQuery("select a from Address a", Address.class).getResultList();
    }

    @Override
    public List<Address> getByState(String state) {
        return entityManager.createQuery("select a from Address a where a.state=:state", Address.class).getResultList();
    }

    @Override
    public List<Address> getByCity(String city) {
        return entityManager.createQuery("select a from Address a where a.city=:city", Address.class).getResultList();
    }

    @Override
    public List<Address> getByZip(String zip) {
        return entityManager.createQuery("select a from Address a where a.zip=:zip", Address.class).getResultList();
    }

    @Override
    public List<Address> getByStreet(String street) {
        return entityManager.createQuery("select a from Address a where a.street=:street", Address.class).getResultList();
    }
}
