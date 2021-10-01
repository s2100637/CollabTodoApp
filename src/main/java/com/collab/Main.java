package com.collab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.collab.services.DatabaseConnector;


public class Main {
    
    public static void main(String[] args) throws SQLException {
        /* Testausta varten */
        String url = "jdbc:sqlite:testi.db";
        DatabaseConnector sConnector = new DatabaseConnector(url);
        sConnector.initDatabase();
        
    }
    
}
