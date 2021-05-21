package com.kyocoolcool.decorator.example1;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/20 4:55 PM
 */
public class GreenTea extends Tea {
    Bubble bubble;
    Pudding pudding;
    OREO oreo;

    public GreenTea() {
        setPrice(5.0);
        setDescription("GreenTea" + ":" + getPrice());
    }

    public Bubble getBubble() {
        return bubble;
    }

    public void setBubble(Bubble bubble) {
        this.bubble = bubble;
    }

    public Pudding getPudding() {
        return pudding;
    }

    public void setPudding(Pudding pudding) {
        this.pudding = pudding;
    }

    public OREO getOreo() {
        return oreo;
    }

    public void setOreo(OREO oreo) {
        this.oreo = oreo;
    }

    @Override
    public Double cost() {
        return this.getPrice() + (oreo == null ? 0 : oreo.getPrice()) +
                (pudding == null ? 0 : pudding.getPrice()) +
                (bubble == null ? 0 : bubble.getPrice());
    }
}
