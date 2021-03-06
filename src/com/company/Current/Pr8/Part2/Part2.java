package com.company.Current.Pr8.Part2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Part2 {

    public static void main(String[] arguments) throws IOException {
        // path = src/com/company/Current/Pr8/Part2/squirrel.jpg
        String path = arguments[0];

        JFrame frame = new JFrame("Практическая № 8 задание 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedImage image = ImageIO.read(new File(path));
        JLabel label = new JLabel(new ImageIcon(image));

        frame.add(label);

        frame.pack();
        frame.setVisible(true);
    }
}
