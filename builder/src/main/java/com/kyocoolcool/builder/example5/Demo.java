package com.kyocoolcool.builder.example5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/10 5:46 PM
 */
public class Demo {
    public static void main(String args[]) throws Exception {
//        Car toyota = new Car.CarBuilder().buildBasicInfo("Toyota", CarType.SUV, 1000000, 7)
//                .builderEngine(new Engine(2600, 5))
//                .build();
//        System.out.println(toyota);
//        try {
//            FileOutputStream fileOut =
//                    new FileOutputStream("./temp");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(toyota);
//            out.close();
//            fileOut.close();
//            System.out.printf("Serialized data is saved in ./temp");
//        } catch (IOException i) {
//            i.printStackTrace();
//        }

        Car car = null;
        try {
            FileInputStream fileIn = new FileInputStream("./temp");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            car = (Car) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Car class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Car...");
        System.out.println(car);
    }
}
