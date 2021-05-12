package com.kyocoolcool.builder.example3;

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public void setGpsNavigator(GPSNavigator gpsNavigator) {
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
