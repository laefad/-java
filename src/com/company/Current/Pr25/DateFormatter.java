package com.company.Current.Pr25;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateFormatter {
    public static void main(String[] args) {
        System.out.println("Введите дату в следующем формате: <Год><Месяц><Число> <Часы1><минуты>");
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();

        String date = sc.next();
        calendar.set(GregorianCalendar.YEAR, Integer.parseInt(date.substring(0,4)));
        calendar.set(GregorianCalendar.MONTH, Integer.parseInt(date.substring(4,6)));
        calendar.set(GregorianCalendar.DAY_OF_MONTH, Integer.parseInt(date.substring(6,8)));

        date = sc.next();
        calendar.set(GregorianCalendar.HOUR_OF_DAY, Integer.parseInt(date.substring(0,2)));
        calendar.set(GregorianCalendar.MINUTE, Integer.parseInt(date.substring(2,4)));

        System.out.println(new SimpleDateFormat("EEEE, dd MMMMM yyyy 'в' H:m").format(calendar.getTime()));

        //Задание 3
        calendar.set(GregorianCalendar.YEAR, 2020);
        calendar.set(GregorianCalendar.MONTH, 10);
        calendar.set(GregorianCalendar.DAY_OF_MONTH, 27);
        calendar.set(GregorianCalendar.HOUR_OF_DAY, 9);
        calendar.set(GregorianCalendar.MINUTE, 10);
        System.out.println("Дараган Ф.А.");
        System.out.println("Дата получения: " + new SimpleDateFormat("EEEE, dd MMMMM yyyy 'в' H:m").format(calendar.getTime()));
        System.out.println("Дата выполнения: " + new SimpleDateFormat("EEEE, dd MMMMM yyyy 'в' H:m").format(new Date()));
    }
}
