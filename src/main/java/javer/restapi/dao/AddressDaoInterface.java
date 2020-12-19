package javer.restapi.dao;

import java.util.List;

public interface AddressDaoInterface<T> {

    List<T> getByState(String state);

    List<T> getByCity();

    List<T> getByZip();

    List<T> getByStreet();

}
