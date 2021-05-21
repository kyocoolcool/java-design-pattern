package com.kyocoolcool.bridge.example0.online;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 2:02 PM
 */
public class ColdCard extends OnlineTransaction {

    @Override
    public double discount(double price) {
        System.out.println("OnlineTransaction");
        return price * 0.7;
    }
}
