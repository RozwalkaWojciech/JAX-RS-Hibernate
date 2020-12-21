package javer.restapi.dao;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public interface AddressDaoInterface<T> extends Dao<T> {

    List<T> getByState(String state);

    List<T> getByCity(String city);

    List<T> getByZip(String zip);

    List<T> getByStreet(String street);

}
