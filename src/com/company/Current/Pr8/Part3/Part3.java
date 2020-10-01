package com.company.Current.Pr8.Part3;


// Создать окно, реализовать анимацию, с помощью картинки,
// состоящей из нескольких кадров.

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Part3 {

    private static final int width = 1600;
    private static final int height = 900;

    public static void main(String[] arguments) throws IOException {

        String path = "src/com/company/Current/Pr8/Part3/Images/";
        String[] paths = {path + "0.jpg", path + "1.jpg"};

        JPanel panel = new JPanel();

        //JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Практическая № 8 задание 3");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        int count = 1;
        while(true)
        {
            count++;
            count %= 2;

            frame.repaint();
            BufferedImage image = ImageIO.read(new File(paths[count]));
            JLabel label = new JLabel(new ImageIcon(image));
            panel.add(label);

            frame.add(panel);
            frame.repaint();
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                break;
            }
        }

    }

}
