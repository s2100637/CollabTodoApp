package com.collab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
    
    public static void main(String[] args) throws SQLException {

        Connection db = DriverManager.getConnection("jdbc:sqlite:testi.db");

        Statement statement = db.createStatement();
        statement.execute("CREATE TABLE Tuotteet (id INTEGER PRIMARY KEY, nimi TEXT, hinta INTEGER)");
        statement.execute("INSERT INTO TUOTTEET (nimi, hinta) VALUES ('retiisi', 7)");
    }
    
}
