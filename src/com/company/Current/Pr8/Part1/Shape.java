package com.company.Current.Pr8.Part1;

import java.awt.*;
import java.awt.geom.Point2D;

public abstract class Shape
{
    Point2D.Double position;
    Color color;

    public abstract void paint(Graphics g);

    Shape (Point2D.Double point, Color color)
    {
        position = point;
        this.color = color;
    }
}

