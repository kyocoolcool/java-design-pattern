package com.kyocoolcool.builder.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/10 5:46 PM
 */
public class Demo {
    public static void main(String args[]) {
        Car car = new Car("Lamborghini", CarType.COUPE,100000000,2,
                new Engine(2500,10),Transmission.AUTOMATIC,new GPSNavigator("內湖區"));
        System.out.println(car);
    }
}
