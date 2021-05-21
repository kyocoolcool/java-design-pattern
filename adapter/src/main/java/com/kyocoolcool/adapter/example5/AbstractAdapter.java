package com.kyocoolcool.adapter.example5;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 3:45 PM
 */
public class AbstractAdapter implements Voltage5V{
    @Override
    public int output5v() {
        return 0;
    }

    @Override
    public boolean open() {
        return false;
    }

    @Override
    public boolean close() {
        return false;
    }
}
