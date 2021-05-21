package com.kyocoolcool.bridge.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 2:08 PM
 */
public class PhysicalTransaction implements Transaction {
    private Card card;
    public PhysicalTransaction(Card card) {
        this.card = card;
    }

    @Override
    public Card useCard() {
        System.out.println("PhysicalTransaction");
        return this.card;
    }
}
