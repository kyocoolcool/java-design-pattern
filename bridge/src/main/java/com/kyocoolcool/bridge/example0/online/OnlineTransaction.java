package com.kyocoolcool.bridge.example0.online;

import com.kyocoolcool.bridge.example0.Transaction;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 2:01 PM
 */
public abstract class OnlineTransaction implements Transaction {
    @Override
    public double discount(double price) {
        return price;
    }
}
