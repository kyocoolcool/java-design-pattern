package com.kyocoolcool.bridge.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 1:43 PM
 */
public class CRUD {
    public static void main(String[] args) {
        DriverManager oracleDriverManager = new DriverManager(new OracleConnection());
        Connection oracleConnection = oracleDriverManager.getConnection();
        oracleConnection.open();
        oracleConnection.close();

//        DriverManager mySQLDriverManager = new DriverManager(new MySQLConnection());
//        Connection mySQLConnection = mySQLDriverManager.getConnection();
//        mySQLConnection.open();
//        mySQLConnection.close();
    }
}
