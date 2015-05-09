package com.company;

public class Triangle extends Figure {
    private double height;
    private double base;

    Triangle(double h, double w) {
        height = h;
        base = w;
    }

    @Override
    public String getName() {
        return super.getName() + "Triangle";
    }

    @Override
    final public double getSq() {
        return (0.5 * height * base);
    }

}