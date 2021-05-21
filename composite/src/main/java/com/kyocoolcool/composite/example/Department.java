package com.kyocoolcool.composite.example;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/21 12:55 PM
 */
public class Department extends Organization {

    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
