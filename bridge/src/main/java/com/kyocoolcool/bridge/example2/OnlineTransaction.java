package com.kyocoolcool.bridge.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 2:01 PM
 */
public class OnlineTransaction implements Transaction {
    private Card card;

    public OnlineTransaction(Card card) {
        this.card = card;
    }

    @Override
    public Card useCard() {
        System.out.println("OnlineTransaction");
        return this.card;
    }
}
