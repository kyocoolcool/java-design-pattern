package com.kyocoolcool.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/21 12:55 PM
 */
public class Division extends Organization {
    List<Organization> Departments = new ArrayList<Organization>();

    public Division(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(Organization organization) {
        Departments.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        Departments.remove(organization);
    }

    @Override
    public void print() {
        System.out.println("--------" + getName() + "-------");
        Departments.forEach(organization -> organization.print());
    }
}
