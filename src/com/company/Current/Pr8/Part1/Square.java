package com.company.Current.Pr8.Part1;

import java.awt.*;
import java.awt.geom.Point2D;

public class Square extends Shape {
    private int a;

    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(color);
        g.fillRect((int)position.getX(), (int)position.getY(), a, a);
    }

    Square(Point2D.Double center, int a, Color color)
    {
        super(center, color);
        this.a = a;
        setOpaque(false);
    }
}
