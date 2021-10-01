package com.collab.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.collab.domain.Todo;

/**
 * Dao for todo 
 */
public class DatabaseTodoDao implements Dao<Todo, Integer> {
    private Connection connection;

    public DatabaseTodoDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Todo todo) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Todo read(Integer key) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Todo update(Todo todo) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer key) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Todo> list() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
}
