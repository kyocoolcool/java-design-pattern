package com.kyocoolcool.bridge.example0;

import com.kyocoolcool.bridge.example0.online.ColdCard;
import com.kyocoolcool.bridge.example0.online.OnlineTransaction;
import com.kyocoolcool.bridge.example0.physical.PhysicalTransaction;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 2:10 PM
 */
public class Customer {
    public static void main(String[] args) {
        double product = 100;

        OnlineTransaction onlineTransaction = new com.kyocoolcool.bridge.example0.online.ColdCard();
        double realPrice=onlineTransaction.discount(product);
        System.out.println(realPrice);

        PhysicalTransaction physicalTransaction = new com.kyocoolcool.bridge.example0.physical.ColdCard();
        double realPrice2=physicalTransaction.discount(product);
        System.out.println(realPrice2);
    }
}
