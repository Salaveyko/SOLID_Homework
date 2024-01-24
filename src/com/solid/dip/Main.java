package com.solid.dip;

/**
 * Dependency Inversion Principle
 * Entities must depend on abstractions, not on concretions. It states that the high-level
 * module must not depend on the low-level module, but they should depend on abstractions.
 * ----
 * There was no task here, so I used my imagination and created a Factory.
 */
public class Main {
    public static void main(String[] args) {
        DatabaseConnection mysql = DataBaseConnectionFactory.connect(DatabaseType.MYSQL);
        mysql.connect();

        DatabaseConnection postgres = DataBaseConnectionFactory.connect(DatabaseType.POSTGRESQL);
        postgres.connect();
    }
}
