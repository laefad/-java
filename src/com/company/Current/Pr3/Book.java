package com.company.Current.Pr3;

public class Book
{
    private int year;
    private int amountOfPages;
    private String author;
    private String name;

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setAmountOfPages(int amountOfPages) {
        if (amountOfPages < 0)
            throw new Error("Amount of pages must be greater than 0");
        this.amountOfPages = amountOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Book(int amountOfPages, int year, String author, String name)
    {
        setAmountOfPages(amountOfPages);
        setYear(year);
        setAuthor(author);
        setName(name);
    }
}
