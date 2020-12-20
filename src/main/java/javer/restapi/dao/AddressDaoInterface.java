package javer.restapi.dao;

import java.util.List;

public interface AddressDaoInterface<T> {

    List<T> getByState(String state);

    List<T> getByCity(String city);

    List<T> getByZip(String zip);

    List<T> getByStreet(String street);

}
