package com.kyocoolcool.singleton.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 9:20 AM
 */
public enum Channel {
    INSTANCE;

    public void open() {
        System.out.println("Channel Open");
    }

    public void close() {
        System.out.println("Channel Close");
    }

    public boolean isOpen() {
        return true;
    }
}
