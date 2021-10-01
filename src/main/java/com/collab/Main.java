package com.collab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.collab.services.DatabaseConnector;


public class Main {
    
    public static void main(String[] args) throws SQLException {
        /* Testausta varten */
        String url = "jdbc:sqlite:testi.db";
        DatabaseConnector sConnector = new DatabaseConnector(url);
        Connection conn = sConnector.createConnection();
        sConnector.initDatabase();

        /* Get columns from Todos */
        /* ResultSet resultSet = conn.prepareStatement("PRAGMA table_info(Todos);").executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        } */
        /* Get tables from master */
        /* ResultSet resultSet = conn.prepareStatement(
            "SELECT * FROM sqlite_master WHERE type='table';").executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        } */
        
        
    }
    
}
