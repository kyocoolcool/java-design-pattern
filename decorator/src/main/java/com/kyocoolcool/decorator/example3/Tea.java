package com.kyocoolcool.decorator.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 4:52 PM
 */
public class Tea extends Drink {
    @Override
    public Double cost() {
        return super.getPrice();
    }
}
