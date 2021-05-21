package com.kyocoolcool.decorator.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 5:04 PM
 */
public class Pudding extends Decorator {
    public Pudding(Drink component) {
        super(component);
        setDescription("Pudding");
        setPrice(4.0);
    }
}
