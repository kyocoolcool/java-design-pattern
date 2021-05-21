package com.kyocoolcool.decorator.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 4:55 PM
 */
public class BlackTea extends Tea {

    public BlackTea() {
        setPrice(10.0);
        setDescription("BlackTea"+":"+getPrice());
    }
}
