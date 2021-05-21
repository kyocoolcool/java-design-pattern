package com.kyocoolcool.composite.example;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/21 12:45 PM
 */
public abstract class Organization {
    private String name;
    private String description;

    public Organization(String name, String description) {
        this.name = name;
        this.description = description;
    }

    protected void add(Organization organization) {
        throw new UnsupportedOperationException();
    }

    protected void remove(Organization organization) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void print();
}
