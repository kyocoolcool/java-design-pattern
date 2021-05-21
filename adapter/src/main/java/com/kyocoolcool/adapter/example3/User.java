package com.kyocoolcool.adapter.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 2:36 PM
 */
public class User {
    public static void main(String[] args) {
        int locationVoltage = 60;
        Phone phone = new Phone();
        TransferAdapter transferAdapter = new TransferAdapter();
        transferAdapter.handleAdapterHashMap.put(60, new Voltage60VAdapter());
        transferAdapter.voltageList.add(new Voltage60V());
        phone.charging(transferAdapter.choose(locationVoltage));
    }
}
