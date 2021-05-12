package com.kyocoolcool.singleton.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/10 8:11 PM
 */
public class LazyLoad {
    private static LazyLoad obj;

    private LazyLoad() {
        System.out.println("LazyLoad instance");
    }

    public static LazyLoad getInstance() {
//        if (obj == null) {
//            synchronized (B.class) {
                if (obj == null) {
                    obj = new LazyLoad();//instance will be created at request time
                }
//            }
//        }
        return obj;
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(()->{
//                B.getInstance();
//            }).start();
//        }
//    }

}
