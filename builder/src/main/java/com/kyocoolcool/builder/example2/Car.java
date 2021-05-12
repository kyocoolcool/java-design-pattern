package com.kyocoolcool.builder.example2;

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

    private Car() {
    }

    public static class CarBuilder {
        Car car = new Car();

        public CarBuilder buildBasicInfo(String brand, CarType carType, int price, int seats) {
            car.brand = brand;
            car.carType = carType;
            car.price = price;
            car.seats = seats;
            return this;
        }

        public CarBuilder builderEngine(Engine engine) {
            car.engine = engine;
            return this;
        }

        public CarBuilder builderTransmission(Transmission transmission) {
            car.transmission = transmission;
            return this;
        }

        public CarBuilder builderGPSNavigator(GPSNavigator gpsNavigator) {
            car.gpsNavigator = gpsNavigator;
            return this;
        }

        public Car build() throws Exception {
            if (car.engine == null) {
                throw new Exception("Car must have engine");
            }
            return car;
        }
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
