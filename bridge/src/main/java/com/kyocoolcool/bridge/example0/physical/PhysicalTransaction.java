package com.kyocoolcool.bridge.example0.physical;

import com.kyocoolcool.bridge.example0.Transaction;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 2:08 PM
 */
public class PhysicalTransaction implements Transaction {
    @Override
    public double discount(double price) {
        return price;
    }
}
