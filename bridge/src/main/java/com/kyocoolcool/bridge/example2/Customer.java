package com.kyocoolcool.bridge.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 2:10 PM
 */
public class Customer {
    public static void main(String[] args) {
        double product = 100;

        OnlineTransaction onlineTransaction = new OnlineTransaction(new VVIPCard());
        double realPrice = onlineTransaction.useCard().discount(product);
        System.out.println(realPrice);
    }
}
