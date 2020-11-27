package com.company.Current.Pr24.Part3;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class TextDocument implements IDocument {

    String text;
    String name;

    TextDocument () {
        text = "";
        name = "new file";
    }

    public void create (JFrame frame) {
        Container container = frame.getContentPane();
        BorderLayout layout = new BorderLayout();
        JPanel menu = new JPanel(new GridLayout(1, 5));
        JPanel panel = new JPanel(new GridLayout(1, 1));
        container.setLayout(layout);

        frame.setLocation(1000,300);
        frame.setSize(600,500);

        JLabel fileLabel = new JLabel("Файл");
        JTextField textField = new JTextField();
        JButton openButton = new JButton("Открыть");
        JButton newButton = new JButton("Новый");
        JButton closeButton = new JButton("Закрыть");
        JButton saveButton = new JButton("Сохранить");

        menu.add(fileLabel);
        menu.add(openButton);
        menu.add(newButton);
        menu.add(closeButton);
        menu.add(saveButton);

        panel.add(textField);

        container.add(menu, "North");
        container.add(panel);

        openButton.addActionListener( e -> {
            String result = JOptionPane.showInputDialog(
                    container,
                    "<html><p>Введите имя файла:</p></html>");
            Open(result);
            frame.setTitle(this.name);
            textField.setText(this.text);
        });

        closeButton.addActionListener( e -> {
            Save();
            New("new file");
            textField.setText("");
            frame.setTitle(this.name);
        });

        saveButton.addActionListener( e -> {
            this.text = textField.getText();
            Save();
        });

        newButton.addActionListener( e -> {
            String result = JOptionPane.showInputDialog(
                    container,
                    "<html><p>Введите имя файла:</p></html>");
            New(result);
            textField.setText("");
            frame.setTitle(this.name);
        });

        frame.setVisible(true);
    }

    public TextDocument Open(String name) {
        try {
            this.text = Files.lines(Paths.get("src/com/company/Current/Pr24/Part3/" + name + ".txt")).collect(Collectors.joining());
            this.name = name;
        } catch (IOException e) {
            New(name);
        }
        return this;
    }

    public TextDocument New(String name) {
        if (name.length() > 0)
            new File("src/com/company/Current/Pr24/Part3/" + name + ".txt");
        this.text = "";
        this.name = name;
        return this;
    }

    @Override
    public TextDocument New(JFrame frame) {
        New(this.name);
        create(frame);
        return this;
    }

    @Override
    public TextDocument Open(JFrame frame) {
        Open(this.name);
        create(frame);
        return this;
    }

    public void Save() {
        try (PrintWriter out = new PrintWriter("src/com/company/Current/Pr24/Part3/" + name + ".txt")) {
            out.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
