package com.kyocoolcool.adapter.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 2:03 PM
 */
public class Voltage110V extends Voltage{
    int value = 110;
    public int output() {
        System.out.println("電壓:"+value);
        return value;
    }
}
