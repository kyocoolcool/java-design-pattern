package com.kyocoolcool.builder.example4;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/11 4:12 PM
 */
public class Demo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ").append("World");
        System.out.println(stringBuilder.toString());
    }
}
