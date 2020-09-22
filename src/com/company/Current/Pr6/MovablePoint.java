package com.company.Current.Pr6;

public class MovablePoint implements Movable {
    public int x, y, speed;

    MovablePoint(int x, int y, int speed)
    {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void move() {
        x+=speed;
        y+=speed;
    }
}
