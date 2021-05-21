package com.kyocoolcool.decorator.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 4:55 PM
 */
public class GreenTea extends Tea {
    public GreenTea() {
        setPrice(20.0);
        setDescription("GreenTea"+":"+getPrice());
    }
}
