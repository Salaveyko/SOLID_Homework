package com.solid.dip.impl;

import com.solid.dip.Interfaces.DatabaseConnection;

public class PostgreSqlConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("PostgreSQL DB is connected.");
    }
}
