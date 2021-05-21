package com.kyocoolcool.bridge.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 1:33 PM
 */
public class MySQLConnection implements Connection {
    @Override
    public void open() {
        System.out.println("MySQL connected");
    }

    @Override
    public void close() {
        System.out.println("MySQL disconnected");
    }
}
