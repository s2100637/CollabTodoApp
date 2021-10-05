package com.collab.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.collab.domain.Todo;
import com.collab.services.DatabaseConnector;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseTodoDaoTest {
    private DatabaseConnector dbConnector;
    private Connection connection;
    private DatabaseTodoDao databaseTodoDao;

    @BeforeEach
    void init() {
        dbConnector = new DatabaseConnector("jdbc:sqlite:src/test/java/com/collab/test-database.db");
        connection = dbConnector.createConnection();
        dbConnector.initDatabase();
        databaseTodoDao = new DatabaseTodoDao(connection);
    }

    @Test
    void testCreate() throws SQLException {
        assertTrue(databaseTodoDao.list().isEmpty());
        assertEquals(0, databaseTodoDao.list().size());
        databaseTodoDao.create(new Todo("eka", "eka sisältö"));
        assertEquals(1, databaseTodoDao.list().size());
        databaseTodoDao.create(new Todo("toka", "toka sisältö"));
        assertEquals(2, databaseTodoDao.list().size());
        databaseTodoDao.create(new Todo("kolmas", "kolmas"));
        assertEquals(3, databaseTodoDao.list().size());

    }

    @Test
    void testDelete() throws SQLException {
        databaseTodoDao.create(new Todo("deletoidaan", "deletoidaan tamakin"));
        databaseTodoDao.create(new Todo("toka del", "toka otsikko del"));
        databaseTodoDao.create(new Todo("kolmas del", "kolmas otsikko myös del"));
        assertEquals(3, databaseTodoDao.list().size());
        databaseTodoDao.delete(1);
        assertEquals(2, databaseTodoDao.list().size());
        databaseTodoDao.delete(2);
        assertEquals(1, databaseTodoDao.list().size());
        databaseTodoDao.delete(3);
        assertEquals(0, databaseTodoDao.list().size());

    }

    @Test
    void testList() {

    }

    @Test
    void testRead() {

    }

    @Test
    void testUpdate() {

    }

    @AfterEach
    void tearDown() throws SQLException {
        PreparedStatement pStatement = connection.prepareStatement("DROP TABLE Todos");
        pStatement.executeUpdate();
    }
}
