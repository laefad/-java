package com.company.Current.Pr7;

import java.awt.Color;

public class Drawer extends Furniture {

    private double width;
    private double length;
    private double height;

    @Override
    double getVolume() {
        return width * length * height;
    }

    Drawer (double price, Color color, double width, double length ,double height)
    {
        super("drawer", price, color);
        this.height = height;
        this.width = width;
        this.length = length;
    }
}
