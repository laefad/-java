package com.company.Current.Pr14;

import com.company.Current.Pr13.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Test_class {
    Student[] students = new Student[10];
    Random random = new Random();

    private String getRandomName()
    {
        String result = "";
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for(int i=0; i<10; i++)
            result += characters.charAt(random.nextInt(characters.length()));
        return result;
    }

    public Test_class() {
        for(int i = 0; i < students.length; i++)
            students[i] = new Student(random.nextInt(9999), (random.nextInt(9799) + 200) / 100d, getRandomName());
        SearchID(students[5].getId());
        SortByGPA();
    }

    public void printSortResult(long time) {
        System.out.println("-----------------------");
        for(Student student : students)
            System.out.println(student.toString());
        System.out.println("Время поиска : " + time / 1000 + " мс");
        System.out.println("-----------------------");
    }

    public void printSearchResult(Student student, long time) {
        System.out.println("-----------------------");
        System.out.println("Ищем студента с ID = " + student.getId());
        System.out.println(student.toString());
        System.out.println("Время поиска: " + time / 1000 + " мс");
        System.out.println("-----------------------");
    }

    private void SearchID(int id)
    {
        long start = System.nanoTime();
        Student temp = Search.LinearSearch(students, id);
        long end = System.nanoTime();
        System.out.println("Линейный поиск, пространственная сложность: O(1), временная: O(n)");
        printSearchResult(temp, end-start);

        SortByID();
        start = System.nanoTime();
        temp = Search.BinarySearch(students, id);
        end = System.nanoTime();
        System.out.println("Бинарный поиск, пространственная сложность: O(log n), временная: O(log n)");
        printSearchResult(temp, end-start);
    }

    private void SortByGPA() {
        System.out.println("Сортировка студентов по GPA");

        long start = System.nanoTime();
        Sort.QuickSort(students, 0, students.length-1);
        long end = System.nanoTime();
        System.out.println("Бинарная сортировка, пространственная сложность: O(n log n), временная: O(n log n)");
        printSortResult(end-start);

        start = System.nanoTime();
        Sort.MergeSort(students, 0, students.length-1);
        end = System.nanoTime();
        System.out.println("Сортировка слиянием, пространственная сложность: O(n), временная: O(n log n)");
        printSortResult(end-start);
    }

    private void SortByID() {
        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getId(), s2.getId());
            }
        });
    }

    public static void main(String[] args) {
        new Test_class();
    }
    // Почему-то первая сортировка или первый поиск занимают на три порядка больше времени
    // Может это какая-то особенность java ?
    // Но чисто теоретически : линейный поискк медленнее, чем бинарный, хотя бинарный требет прдварительной сортировки
    // По памяти тут выигрывает линейный поиск
    // Сортировка слиянием лучше бинарной из-за того, что у сортировки слиянием нет наихудшего случая O(n^2)
    // Сортировка слиянием занимает меньше памяти
}
