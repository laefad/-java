package com.company.Old.Pr2;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        System.out.println(c1.GetRadius());
        System.out.println(c1.GetLength());
        System.out.println(c1.GetSquare());
        c1.SetRadius(4);
        System.out.println(c1.GetRadius());
        System.out.println(c1.GetLength());
        System.out.println(c1.GetSquare());
        c1.SetRadius(-5);
        System.out.println(c1.GetRadius());
    }
}
