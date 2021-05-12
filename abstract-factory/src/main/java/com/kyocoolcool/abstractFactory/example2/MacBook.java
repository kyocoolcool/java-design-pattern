package com.kyocoolcool.abstractFactory.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/12 12:28 PM
 */
public class MacBook implements NoteBook {
    @Override
    public void Browsing() {
        System.out.println("Apple Browsing");
    }

    @Override
    public void Coding() {
        System.out.println("Apple Coding");
    }
}
