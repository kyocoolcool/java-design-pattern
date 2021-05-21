package com.kyocoolcool.adapter.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 2:11 PM
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5v() {
        int voltage = output220v();
        int transferVoltage = voltage / 44;
        return transferVoltage;
    }
}
