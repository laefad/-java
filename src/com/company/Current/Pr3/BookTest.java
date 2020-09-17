package com.company.Current.Pr3;

public class BookTest {

    public static void main(String[] args) {
        test();
    }

    public static void test()
    {
        Book b = new Book(10,1978, "Vasya", "Beta");

        System.out.println("Amount of pages = " + b.getAmountOfPages());
        b.setAmountOfPages(200);
        System.out.println("Amount of pages = " + b.getAmountOfPages());

        System.out.println("Year = " + b.getYear());
        b.setYear(2000);
        System.out.println("Year = " + b.getYear());

        System.out.println("Author = " + b.getAuthor());
        b.setAuthor("Василий Пупкин");
        System.out.println("Author = " + b.getAuthor());

        System.out.println("Book name = " + b.getName());
        b.setName("Теория пельменей");
        System.out.println("Book name = " + b.getName());
    }
}
