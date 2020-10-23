package com.company.Current.Pr13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Pr13_1 extends Test_class
{
    public Pr13_1(int n)
    {
        super(n);
    }

    void sortById()
    {
        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getId(), s2.getId());
            }
        });
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество студентов: ");
        int n = scanner.nextInt();

        Pr13_1 pr13_1 = new Pr13_1(n);
        pr13_1.sortById();
        pr13_1.printStudents();
    }
}
