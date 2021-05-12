package com.kyocoolcool.factory.simple.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/11 8:36 PM
 */
public class Consumer {
    public static void main(String[] args) {
        Car maserati = CarFactory.getCar("Maserati");
        Car toyota = CarFactory.getCar("Toyota");
        System.out.println(maserati.getName());
        System.out.println(toyota.getName());

//        Car maserati1 = CarFactory.getMaserati();
//        System.out.println(maserati1.getName());
    }
}
