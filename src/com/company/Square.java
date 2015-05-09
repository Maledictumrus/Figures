package com.company;

public class Square extends Figure {
    private double height, width;


    Square(double h, double w) {
        height = h;
        width = w;
    }

    @Override
    public String getName() {
        return super.getName() + "Square";
    }

    @Override
    public final double getSq() {
        return (height * width);
    }

}
