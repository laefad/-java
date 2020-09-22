package com.company.Current.Pr4_5;

import java.awt.*;

abstract class Shape {
    double area;
    Color color;
    double weight;

    double getPressure()
    {
        return weight * 10 / area;
    }

    abstract void calcArea();
}
