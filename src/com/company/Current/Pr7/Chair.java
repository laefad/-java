package com.company.Current.Pr7;

import java.awt.Color;

public class Chair extends Furniture {

    private double square;
    private double height;

    @Override
    double getVolume() {
        return square * height;
    }

    Chair (double price, Color color, double square, double height)
    {
        super("chair", price, color);
        this.square = square;
        this.height = height;
    }


}
