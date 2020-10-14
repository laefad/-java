package com.company.Current.Pr11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Game extends JFrame {

    private int attempts = 0;
    private int val;

    public Game(){

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Проверить");
        JTextArea textArea = new JTextArea();
        button.setBounds(40,80,100,20);
        textArea.setBounds(30,30,120,20);

        add(button);
        add(textArea);

        Random random = new Random();
        val = random.nextInt(42);

        setSize(200,200);

        button.addActionListener(actionEvent -> {

            int receivedValue = Integer.parseInt(textArea.getText());

            if (receivedValue == val)
            {
                setVisible(false);
                dispose();
                JOptionPane.showMessageDialog(null, "Вы угадали число");
            }
            else if (receivedValue < val)
                JOptionPane.showMessageDialog(null,"Загаданное число больше чем " + receivedValue);
            else
                JOptionPane.showMessageDialog(null,"Загаданное число меньше чем " + receivedValue);

            textArea.setText("");

            if (++attempts == 3)
            {
                JOptionPane.showMessageDialog(null,"Попытки закончились, вы проиграли");
                setVisible(false);
                dispose();
            }

        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Game();
    }
}
