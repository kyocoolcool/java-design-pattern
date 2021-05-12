package com.kyocoolcool.abstractFactory.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/12 9:30 AM
 */
public class SamSungPhoneProduct implements Phone{
    public void start() {
        System.out.println("SamSung 開機");
    }

    public void close() {
        System.out.println("SamSung 關機");
    }

    public void call() {
        System.out.println("SamSung 打電話");
    }

    public void sendSMS() {
        System.out.println("SamSung 傳簡訊");
    }
}
