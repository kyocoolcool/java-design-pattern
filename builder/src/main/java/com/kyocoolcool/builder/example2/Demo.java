package com.kyocoolcool.builder.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/10 5:46 PM
 */
public class Demo {
    public static void main(String args[]) throws Exception {
        Car toyota = new Car.CarBuilder().buildBasicInfo("Toyota", CarType.SUV, 1000000, 7)
                .builderEngine(new Engine(2600,5))
                .build();
        System.out.println(toyota);
    }
}
