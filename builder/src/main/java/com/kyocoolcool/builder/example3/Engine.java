package com.kyocoolcool.builder.example3;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/11 10:52 AM
 */
public class Engine {
    private final double volume;
    private final double kilometre;

    public Engine(double volume, double kilometre) {
        this.volume = volume;
        this.kilometre = kilometre;
    }

    public double getVolume() {
        return volume;
    }

    public double getKilometre() {
        return kilometre;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", kilometre=" + kilometre +
                '}';
    }
}
