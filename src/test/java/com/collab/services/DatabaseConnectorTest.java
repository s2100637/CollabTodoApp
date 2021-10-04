package com.collab.services;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectorTest {
    private DatabaseConnector dummyConnector;
    private String url = "jdbc:sqlite:src/test/java/com/collab/test-database.db";
    private Connection dummyConnection;

    @BeforeEach
    void setUp() {
        this.dummyConnector = new DatabaseConnector(url);
        this.dummyConnection = dummyConnector.createConnection();
        dummyConnector.initDatabase();

    }

    @Test
    void testCreateConnection() throws SQLException {
        assertNotNull(dummyConnection);
        assertFalse(dummyConnection.isClosed());

    }

    @Test
    void testInitDatabase() throws SQLException {

    }

    /*
     * //Get master table: SELECT * FROM sqlite_master WHERE type="table";
     */
    /*
     * //Get schema: PRAGMA table_info(Todos);
     */
    /* Drop tables after testing? */
    @AfterEach
    void tearDown() throws SQLException {
        PreparedStatement pStatement = dummyConnection.prepareStatement("DROP TABLE Todos;");
        pStatement.executeUpdate();

    }
}
