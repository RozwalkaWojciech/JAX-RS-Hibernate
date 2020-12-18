package javer.restapi.dao;

import java.util.List;

public interface Dao<T> {

    T save(T t);

    T get(Integer id);

    T update(Integer id, T t);

    void delete(Integer id);

    List<T> getAll();
}
