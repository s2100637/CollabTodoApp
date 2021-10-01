package com.collab.dao;

import java.sql.SQLException;
import java.util.List;

/**
 * An interface for generic dao-model 
 */
public interface Dao<T, K> {

    //create todo
    void create (T object) throws SQLException;
    // read todo
    T read(K key) throws SQLException;

    // update a todo
    T update(T object) throws SQLException;

    // delete a todo
    void delete(K key) throws SQLException;
    // list todos
    List<T> list() throws SQLException;
    
}
