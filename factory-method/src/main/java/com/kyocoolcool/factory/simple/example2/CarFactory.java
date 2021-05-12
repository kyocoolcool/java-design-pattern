package com.kyocoolcool.factory.simple.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/11 8:39 PM
 */
public class CarFactory {
    //method1
    public static Car getCar(String carName) {
        if (carName.equals("Maserati")) {
            return new Maserati();
        } else if (carName.equals("Toyota")) {
            return new Toyota();
        }else {
            return null;
        }
    }

    //method2
    public static Car getToyota() {
        return new Toyota();
    }

    public static Car getMaserati() {
        return new Maserati();
    }
}
