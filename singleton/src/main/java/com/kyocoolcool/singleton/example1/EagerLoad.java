package com.kyocoolcool.singleton.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/10 8:09 PM
 */
public class EagerLoad {
    private static EagerLoad obj = new EagerLoad();//Early, instance will be created at load time

    private EagerLoad() {
        System.out.println("EagerLoad instance");
    }

    public static EagerLoad getInstance() {
        return obj;
    }


    public static void main(String[] args) {
        EagerLoad instance = getInstance();
        EagerLoad instance2 = getInstance();
        EagerLoad instance3 = getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance3);
    }
}
