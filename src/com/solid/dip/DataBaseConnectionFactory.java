package com.solid.dip;

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
