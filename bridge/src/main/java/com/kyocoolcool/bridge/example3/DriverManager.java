package com.kyocoolcool.bridge.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 1:30 PM
 */
public class DriverManager {
    private Connection connection;

    public DriverManager(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        System.out.println("MySQL Driver");
        return this.connection;
    }
}
