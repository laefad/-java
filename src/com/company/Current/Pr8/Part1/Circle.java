package com.company.Current.Pr8.Part1;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Circle extends Shape {

    private int r;

    @Override
    public void paint(Graphics g)
    {
        g.setColor(color);
        g.fillOval((int)position.getX(), (int)position.getY(), r, r);
    }

    Circle(Point2D.Double center, int r, Color color)
    {
        super(center, color);
        this.r = r;
    }
}
