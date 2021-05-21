package com.kyocoolcool.adapter.example5;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 2:36 PM
 */
public class User {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new AbstractAdapter(){
            @Override
            public int output5v() {
                Voltage220V voltage220V = new Voltage220V();
                int voltage = voltage220V.output220v();
                int transferVoltage = voltage / 44;
                return transferVoltage;
            }
        });
//        phone.charging(new Voltage220V());
    }
}
