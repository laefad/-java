package com.company.Old.Pr2;

public class Circle {
    private double radius = 0;

    public double GetRadius () {
        return radius;
    }

    public void SetRadius (double r) {
        if (r < 0)
            System.out.println("Radius must be greater then 0");
        else
            radius = r;
    }
    public double GetSquare () {
        return Math.PI * radius * radius;
    }

    public double GetLength () {
        return Math.PI * radius * 2;
    }

    Circle (double r) {
        SetRadius(r);
    }

}

