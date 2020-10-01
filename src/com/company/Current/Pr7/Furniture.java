package com.company.Current.Pr7;

import java.awt.Color;

public abstract class Furniture {

    protected String type;
    protected double price;
    protected Color color;

    String getType()
    {
        return type;
    }

    double getPrice()
    {
        return price;
    }

    Color getColor()
    {
        return color;
    }

    abstract double getVolume();

    Furniture(String type, double price, Color color)
    {
        this.type = type;
        this.price = price;
        this.color = color;
    }

}
