package com.company.Current.Pr22;

import com.company.Current.Pr13.Student;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class WindowForStudent extends JFrame {

    public Student[] students;

    private void fillStudents() {
        Random rand = new Random();
        students = new Student[6];

        for (int i = 0; i < students.length; i++)
            students[i] = new Student(
                    rand.nextInt(),
                    rand.nextDouble(),
                    String.valueOf(rand.nextInt(10))
            );
    }

    private void printStudents(JLabel l1) {
        StringBuilder text = new StringBuilder("<html>");

        for (Student s : students)
            text.append(s.toString())
                .append("<br>");

        l1.setText(text.toString());
    }

    private void sort() {
        Arrays.sort(students, Comparator.comparingDouble(Student::getGpa));
    }

    WindowForStudent() {
        fillStudents();

        GridBagLayout gridLayout = new GridBagLayout();
        setLayout(gridLayout);
        Container container = getContentPane();
        setLocation(1000,300);
        setSize(600,500);

        GridBagConstraints c = new GridBagConstraints();
        JButton searchB = new JButton("Искать");
        JButton sortB = new JButton("Отсортировать");
        JLabel l1 = new JLabel("<html>");
        JLabel l2 = new JLabel("<html>");
        JLabel l3 = new JLabel("Введите имя, которое желаете найти: ");
        JTextField textField = new JTextField(16);

        c.gridy = 0;
        container.add(sortB,c);
        c.gridy = 1;
        container.add(l1,c);
        c.gridy = 3;
        container.add(searchB,c);
        c.gridy = 5;
        container.add(l3,c);
        c.gridy = 7;
        container.add(textField,c);
        c.gridy = 9;
        container.add(l2,c);

        sortB.addActionListener( e -> {
            sort();
            printStudents(l1);
        });

        searchB.addActionListener( e -> {
            for (Student s : students)
                if (s.getName().equals(textField.getText())) {
                    l2.setText(s.toString());
                    return;
                }

            l2.setText("Такого имени не существует");
        });

        printStudents(l1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowForStudent();
    }
}
