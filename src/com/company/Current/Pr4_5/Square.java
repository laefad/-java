package com.company.Current.Pr4_5;

import java.awt.*;

public class Square extends Shape {

    public int a;

    Square (int a, Color color, int weight)
    {
        this.a = a;
        this.color = color;
        this.weight = weight;
        calcArea();
    }

    public void calcArea()
    {
        area = a * a;
    }
}
