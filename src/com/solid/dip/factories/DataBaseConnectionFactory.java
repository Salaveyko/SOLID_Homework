package com.solid.dip.factories;

import com.solid.dip.Interfaces.DatabaseConnection;
import com.solid.dip.enumerations.DatabaseType;
import com.solid.dip.impl.MySqlConnection;
import com.solid.dip.impl.PostgreSqlConnection;

public class DataBaseConnectionFactory {
    public static DatabaseConnection connect(DatabaseType dbType) {
        switch (dbType) {
            case MYSQL:
                return new MySqlConnection();
            case POSTGRESQL:
                return new PostgreSqlConnection();
            default:
                throw new IllegalArgumentException("Unsupported database type: " + dbType);
        }
    }
}
