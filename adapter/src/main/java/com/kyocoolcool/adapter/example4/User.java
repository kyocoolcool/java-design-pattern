package com.kyocoolcool.adapter.example4;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 2:36 PM
 */
public class User {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
//        phone.charging(new Voltage220V());
    }
}
