package com.company.Current.Pr8.Part1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;

//Создать окно, нарисовать в нем 20 случайных фигур, случайного цвета.
//Классы фигур должны наследоваться от абстрактного класса Shape,
//в котором описаны свойства фигуры: цвет, позиция.


public class Part1 extends JFrame {

    private static final Random rand = new Random();
    private static final int width = 1600;
    private static final int height = 900;

    public Part1() {
        super("Практическая № 8 задание 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();

        for (int i = 0; i < 200; i++)
        {
            int x = rand.nextInt(width);
            int y = rand.nextInt(height);
            int r = rand.nextInt(200);

            int f = rand.nextInt(2);

            Color c = new Color( rand.nextInt(255) , rand.nextInt(155) + 100, rand.nextInt(255) );

            if (f == 0)
            {
                Circle circle = new Circle(new Point2D.Double(0, 0), r, c);
                circle.setBounds(x - r, y + r, r * 2, r * 2);
                lp.add(circle, JLayeredPane.PALETTE_LAYER);
            }
            else
            {
                Square square = new Square(new Point2D.Double(0, 0), r, c);
                square.setBounds(x - r, y + r, r * 2, r * 2);
                lp.add(square, JLayeredPane.PALETTE_LAYER);
            }
        }

        setSize(width, height);
        setVisible(true);
    }


    public static void main(String[] args)
    {
        new Part1();
    }

}
