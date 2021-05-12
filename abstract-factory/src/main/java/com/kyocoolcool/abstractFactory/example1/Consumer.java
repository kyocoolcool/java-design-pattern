package com.kyocoolcool.abstractFactory.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/12 9:49 AM
 */
public class Consumer {
    public static void main(String[] args) {
        Phone phone = new AppleFactory().phoneProduct();
        phone.call();
        phone.sendSMS();

        Watch watch = new AppleFactory().watchProduct();
        watch.tellTime();
    }
}
