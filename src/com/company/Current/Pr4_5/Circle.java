package com.company.Current.Pr4_5;

import java.awt.*;

public class Circle extends Shape {

    public double r;

    Circle (double r, Color color, double weight)
    {
        this.r = r;
        this.color = color;
        this.weight = weight;
        calcArea();
    }

    public void calcArea()
    {
        area = r * r * Math.PI;
    }

}
