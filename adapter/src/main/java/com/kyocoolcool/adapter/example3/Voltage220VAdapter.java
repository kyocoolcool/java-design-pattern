package com.kyocoolcool.adapter.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 2:11 PM
 */
public class Voltage220VAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5v() {
        int voltage = output();
        int transferVoltage = voltage / 44;
        return transferVoltage;
    }
}
