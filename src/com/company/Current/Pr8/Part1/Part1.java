package com.company.Current.Pr8.Part1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

//Создать окно, нарисовать в нем 20 случайных фигур, случайного цвета.
//Классы фигур должны наследоваться от абстрактного класса Shape,
//в котором описаны свойства фигуры: цвет, позиция.


public class Part1{

    private static final int width = 1600;
    private static final int height = 900;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Практическая № 8 задание 1");
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        for (int i = 0; i < 10; i++)
        {
            int r = i * 20 + i + 10;
            int x = i * 20 + i + 10;
            int y = i * 20 + i + 10;

            Color c = new Color( i *25 , i * 10 + 100, i * 15 );
            System.out.println(String.format("x = %d, y = %d",x,y));
            Circle circle = new Circle(new Point2D.Double(x,y), r, c);
            circle.paint(frame.getGraphics());
        }

    }

}
