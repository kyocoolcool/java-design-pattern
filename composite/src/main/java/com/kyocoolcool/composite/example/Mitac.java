package com.kyocoolcool.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/21 12:55 PM
 */
public class Mitac extends Organization {
    List<Organization> BUs = new ArrayList<Organization>();

    public Mitac(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(Organization organization) {
        BUs.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        BUs.remove(organization);
    }

    @Override
    public void print() {
        System.out.println("*****" + getName() + "*****");
        BUs.forEach(organization -> organization.print());
    }
}
