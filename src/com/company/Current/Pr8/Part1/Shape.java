package com.company.Current.Pr8.Part1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public abstract class Shape extends JComponent
{
    Point2D.Double position;
    Color color;

    @Override
    public abstract void  paintComponent(Graphics g);

    Shape (Point2D.Double point, Color color)
    {
        position = point;
        this.color = color;
    }
}

