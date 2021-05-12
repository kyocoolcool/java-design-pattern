package com.kyocoolcool.abstractFactory.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/12 9:46 AM
 */
public class SamSungFactory implements ProductAbstractFactor {
    public Phone phoneProduct() {
        return new SamSungPhoneProduct();
    }

    public Watch watchProduct() {
        return new SamSungWatchProduct();
    }
}
