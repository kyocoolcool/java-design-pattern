package com.kyocoolcool.abstractFactory.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/12 9:49 AM
 */
public class Consumer {
    public static void main(String[] args) {
        NoteBook noteBook = new AppleFactory().noteBook();
        noteBook.Coding();
    }
}
