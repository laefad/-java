package com.company.Current.Pr7;

import java.awt.Color;

public class Table extends Furniture {

    private double square;
    private double height;
    private double additionalSquare;

    @Override
    double getVolume() {
        return (square + additionalSquare) * height;
    }

    Table (double price, Color color, double square, double additionalSquare, double height)
    {
        super("table", price, color);
        this.square = square;
        this.height = height;
        this.additionalSquare = additionalSquare;
    }

}
