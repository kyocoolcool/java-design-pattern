package com.kyocoolcool.decorator.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 5:08 PM
 */
public class KebukeTeaStore {
    public static void main(String[] args) {
        MilkTea order = new MilkTea();
        System.out.println(order.getDescription());
        System.out.println("這杯飲料:"+order.cost()+"元");

        System.out.println("加一份珍珠");
        order.setBubble(new Bubble());
        System.out.println("這杯飲料:"+order.cost()+"元");

    }

}
