package com.kyocoolcool.factory.method.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/11 8:36 PM
 */
public class Consumer {
    public static void main(String[] args) {
        Car maserati = new MaseratiFactory().getCar();
        Car toyota = new ToyotaFactory().getCar();
        System.out.println(maserati.getName());
        System.out.println(toyota.getName());
    }
}
