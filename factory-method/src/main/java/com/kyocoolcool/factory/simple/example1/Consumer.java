package com.kyocoolcool.factory.simple.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/11 8:36 PM
 */
public class Consumer {
    public static void main(String[] args) {
        Car maserati = new Maserati();
        Car toyota = new Toyota();
        System.out.println(maserati.getName());
        System.out.println(toyota.getName());
    }
}
