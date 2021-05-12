package com.kyocoolcool.factory.method.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/11 8:49 PM
 */
public class MaseratiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Maserati();
    }
}
