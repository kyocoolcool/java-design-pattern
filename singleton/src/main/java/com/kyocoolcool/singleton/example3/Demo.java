package com.kyocoolcool.singleton.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 9:21 AM
 */
public class Demo {
    public static void main(String[] args) {
        Channel.INSTANCE.open();
        System.out.println(Channel.INSTANCE.isOpen());
        Channel.INSTANCE.close();
    }
}
