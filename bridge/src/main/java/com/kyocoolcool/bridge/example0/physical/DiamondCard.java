package com.kyocoolcool.bridge.example0.physical;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 2:05 PM
 */
public class DiamondCard extends PhysicalTransaction {
    @Override
    public double discount(double price) {
        System.out.println("PhysicalTransaction");
        return price*0.5;
    }
}
