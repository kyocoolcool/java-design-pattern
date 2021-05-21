package com.kyocoolcool.adapter.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 2:36 PM
 */
public class User {
    public static void main(String[] args) {
        int locationVoltage = 110;
        Phone phone = new Phone();
        phone.charging(new TransferAdapter().choose(locationVoltage));
    }
}
