package com.kyocoolcool.adapter.example3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/19 2:44 PM
 */
public class TransferAdapter {
     HashMap<Integer, Voltage5V> handleAdapterHashMap = new HashMap<>();
    List<Voltage> voltageList = new ArrayList();

    public Voltage5V choose(int value) {
        handleAdapterHashMap.put(110, new Voltage110VAdapter());
        handleAdapterHashMap.put(220, new Voltage220VAdapter());
        voltageList.add(new Voltage110V());
        voltageList.add(new Voltage220V());
        for (Voltage voltage : voltageList) {
            if (voltage.output() == value) {
                System.out.println(voltage.output()+"v 轉換器使用");
                return handleAdapterHashMap.get(value);
            }
        }
        return null;
    }
}
