package com.kyocoolcool.adapter.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 2:33 PM
 */
public class Phone {
    public void charging(Voltage5V voltage5v) {
        if (voltage5v.output5v() == 5) {
            System.out.println("可以充電");
        } else {
            System.out.println("不能充電");
        }
    }
}
