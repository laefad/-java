package com.company.Current.Pr13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Pr13_2 extends Test_class
{

    public Pr13_2(int n)
    {
        super(n);
    }

    void sortByGpa()
    {
        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                // за счет минуса сортирует в обратном порядке
                return -Double.compare(s1.getGpa(), s2.getGpa());
            }
        });
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество студентов: ");
        int n = scanner.nextInt();

        Pr13_2 pr13_2 = new Pr13_2(n);
        pr13_2.sortByGpa();
        pr13_2.printStudents();
    }
}
