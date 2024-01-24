package com.solid.dip;

public class MySqlConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("MySQL DB is connected.");
    }
}
