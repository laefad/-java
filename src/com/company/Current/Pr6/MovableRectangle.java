package com.company.Current.Pr6;

import com.company.Current.Pr4_5.Rectangle;

import java.awt.*;

public class MovableRectangle extends Rectangle implements Movable {

    public MovablePoint LeftBottom, RightTop;

    @Override
    public void move() {
        LeftBottom.move();
        RightTop.move();
        System.out.println("Rectangle move with " + LeftBottom.speed + " km/h.");
    }

    public boolean pointsHaveSomeSpeed()
    {
        return LeftBottom.speed == RightTop.speed;
    }


    MovableRectangle (int a, int b, Color color, int weight, int speed)
    {
        super(a, b, color, weight);
        LeftBottom = new MovablePoint(0,0, speed);
        RightTop = new MovablePoint(a, b, speed);
    }
}
