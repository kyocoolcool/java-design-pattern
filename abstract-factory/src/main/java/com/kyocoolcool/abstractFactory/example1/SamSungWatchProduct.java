package com.kyocoolcool.abstractFactory.example1;

import java.util.Date;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/12 9:37 AM
 */
public class SamSungWatchProduct implements Watch{
    public void tellTime() {
        System.out.println("SamSung watch time:"+new Date());
    }

    public void countDown() {
        System.out.println("SamSung count down");
    }
}
