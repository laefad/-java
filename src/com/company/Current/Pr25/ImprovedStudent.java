package com.company.Current.Pr25;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ImprovedStudent
{

    private int id;
    private double gpa;
    private String name;
    private Date date;

    public ImprovedStudent(int id, double gpa, String name, Date date)
    {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
        this.date = date;
    }

    public ImprovedStudent()
    {}

    public int getId()
    {
        return id;
    }

    public double getGpa()
    {
        return gpa;
    }

    public String getName()
    {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String toString(String datePattern) {
        return "ImprovedStudent{" +
                "id=" + id +
                ", gpa=" + gpa +
                ", name='" + name + '\'' +
                ", date=" + new SimpleDateFormat(datePattern).format(date) +
                '}';
    }

    public static void main(String[] args) {

        var s = new ImprovedStudent(1,
                0.5,
                "Василий",
                new GregorianCalendar(2001, Calendar.JANUARY , 22).getTime()
        );

        System.out.println(s.toString("d MMM yyyy"));
        System.out.println(s.toString("EEE, d MMMMM yyyy"));
        System.out.println(s.toString("EEEE, dd MMMMM yyyy"));

    }
}
