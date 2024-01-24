package com.solid.dip.impl;

import com.solid.dip.Interfaces.DatabaseConnection;

public class MySqlConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("MySQL DB is connected.");
    }
}
