package com.kyocoolcool.decorator.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 4:57 PM
 */
public class MilkTea extends Tea {
    public MilkTea() {
        setPrice(15.0);
        setDescription("MilkTea" + ":" + getPrice());
    }
}
