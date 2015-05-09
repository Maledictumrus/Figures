package com.company;


public class Circle extends Figure {

    private double radius;

    Circle(double r) {
        radius = r;
    }


    @Override
    public String getName() {
        return super.getName() + "Circle";
    }

    @Override
    final public double getSq() {
        return (Math.pow(radius, 2) * Math.PI);
    }

}