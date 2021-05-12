package com.kyocoolcool.abstractFactory.example1;

import java.util.Date;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/12 9:37 AM
 */
public class AppleWatchProduct implements Watch{
    public void tellTime() {
        System.out.println("Apple watch time:"+new Date());
    }

    public void countDown() {
        System.out.println("Apple count down");
    }
}
