package com.kyocoolcool.decorator.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 5:08 PM
 */
public class KebukeTeaStore {
    public static void main(String[] args) {
        Tea order = new MilkTea();
        Ingredients bubble = new Bubble();
        System.out.println(order.getPrice()+bubble.getPrice());

        Tea order2 = new BlackTea();
        Ingredients pudding = new Pudding();
        System.out.println(order2.getPrice()+pudding.getPrice());
    }
}
