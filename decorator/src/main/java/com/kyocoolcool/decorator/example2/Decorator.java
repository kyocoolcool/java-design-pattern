package com.kyocoolcool.decorator.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 4:58 PM
 */
public class Decorator extends Drink {
    private Drink component;

    public Decorator(Drink component) {
        this.component = component;
    }

    @Override
    public Double cost() {
        //getPrice() is self price
        return super.getPrice()+component.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+":"+super.getPrice()+" && "
                + component.getDescription();
    }
}
