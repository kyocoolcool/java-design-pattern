package com.kyocoolcool.builder.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/11 10:33 AM
 */
public class Car {
    String brand;
    CarType carType;
    int price;
    int seats;
    Engine engine;
    Transmission transmission;
    GPSNavigator gpsNavigator; //optional

    public Car() {
    }

    public Car(String brand, CarType carType, int price, int seats, Engine engine, Transmission transmission) {
        this.brand = brand;
        this.carType = carType;
        this.price = price;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Car( String brand, CarType carType, int price, int seats, Engine engine, Transmission transmission, GPSNavigator gpsNavigator) {
        this.brand = brand;
        this.carType = carType;
        this.price = price;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carType=" + carType +
                ", price=" + price +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", gpsNavigator=" + gpsNavigator +
                '}';
    }
}
