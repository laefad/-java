package com.company.Current.Pr13;

import java.util.Scanner;

public class Test_class {

    public Student[] students;

    public Test_class(int n)
    {
        students = new Student[n];

        for (int i = 0; i < students.length ; ++i)
            students[i] = fillStudent();
    }

    Student fillStudent()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные очередного студента : ");
        System.out.println("id = ");
        int id = scanner.nextInt();
        System.out.println("gpa = ");
        double gpa = scanner.nextDouble();
        System.out.println("name = ");
        String name = scanner.next();
        return new Student(id, gpa, name);
    }

    public void printStudents()
    {
        for (Student s : students)
            System.out.println(s.toString());
    }

}
