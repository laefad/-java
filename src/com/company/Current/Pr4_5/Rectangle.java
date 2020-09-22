package com.company.Current.Pr4_5;

import java.awt.*;

public class Rectangle extends Shape{

    public int a, b;

    public Rectangle (int a, int b, Color color, int weight)
    {
        this.a = a;
        this.b = b;
        this.color = color;
        this.weight = weight;
        calcArea();
    }

    public void calcArea()
    {
        area = a * b;
    }
}
