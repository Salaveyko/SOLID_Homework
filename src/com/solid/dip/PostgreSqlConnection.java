package com.solid.dip;

public class PostgreSqlConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("PostgreSQL DB is connected.");
    }
}
