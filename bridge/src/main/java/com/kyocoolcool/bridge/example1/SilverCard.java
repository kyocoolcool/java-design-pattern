package com.kyocoolcool.bridge.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 2:04 PM
 */
public class SilverCard implements Card {
    @Override
    public double discount(double price) {
        return price*0.8;
    }
}
