package com.kyocoolcool.abstractFactory.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/12 9:46 AM
 */
public class AppleFactory implements ProductAbstractFactor {
    public Phone phoneProduct() {
        return new IPhoneProduct();
    }

    public Watch watchProduct() {
        return new AppleWatchProduct();
    }

    public NoteBook noteBook() {
        return new MacBook();
    }
}
