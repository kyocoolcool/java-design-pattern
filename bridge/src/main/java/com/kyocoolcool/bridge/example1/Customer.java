package com.kyocoolcool.bridge.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 2:10 PM
 */
public class Customer {
    public static void main(String[] args) {
        double product = 100;

        OnlineTransaction onlineTransaction = new OnlineTransaction(new DiamondCard());
        double realPrice=onlineTransaction.useCard().discount(product);
        System.out.println(realPrice);


//        PhysicalTransaction physicalTransaction = new PhysicalTransaction(new SilverCard());
//        double realPrice2 = physicalTransaction.useCard().discount(product);
//        System.out.println(realPrice2);
    }
}
