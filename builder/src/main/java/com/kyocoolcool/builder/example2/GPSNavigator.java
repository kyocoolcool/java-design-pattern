package com.kyocoolcool.builder.example2;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/11 11:00 AM
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }

    @Override
    public String toString() {
        return "GPSNavigator{" +
                "route='" + route + '\'' +
                '}';
    }
}
