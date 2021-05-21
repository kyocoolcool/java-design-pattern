package com.kyocoolcool.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/21 12:55 PM
 */
public class BU extends Organization {
    List<Organization> Divisions = new ArrayList<Organization>();

    public BU(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(Organization organization) {
        Divisions.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        Divisions.remove(organization);
    }

    @Override
    public void print() {
        System.out.println("--------" + getName() + "-------");
        Divisions.forEach(organization -> organization.print());
    }
}
