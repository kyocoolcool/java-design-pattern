package com.kyocoolcool.builder.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/10 5:46 PM
 */
public class Demo {
    public static void main(String args[]) {
        Car car = new Car();
        car.setBrand("Lexus");
        car.setCarType(CarType.SEDAN);
        car.setPrice(12500000);
        car.setSeats(4);
        car.setEngine(new Engine(2000,1));
        car.setTransmission(Transmission.MANUAL);
        System.out.println(car);
    }
}
