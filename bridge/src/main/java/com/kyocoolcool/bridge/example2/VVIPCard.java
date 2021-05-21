package com.kyocoolcool.bridge.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 2:20 PM
 */
public class VVIPCard implements Card{
    @Override
    public double discount(double price) {
        return price * 0.1;
    }
}
