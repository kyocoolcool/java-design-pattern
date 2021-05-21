package com.kyocoolcool.adapter.example4;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 2:11 PM
 */
public class VoltageAdapter implements Voltage5V {
    Voltage220V voltage220V;
    @Override
    public int output5v() {
        Voltage220V voltage220V = new Voltage220V();
        int voltage = voltage220V.output220v();
        int transferVoltage = voltage / 44;
        return transferVoltage;
    }
}
