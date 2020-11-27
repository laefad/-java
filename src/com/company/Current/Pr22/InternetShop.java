package com.company.Current.Pr22;

import java.util.Scanner;

public class InternetShop {

    public static void buy(Client c) {
        if (checkINN(c.getINN()))
            System.out.println(c.getName() + ", заказ оформлен успешно.");
        else
            System.out.println(c.getName() + ", проверьте ваш ИНН. Заказ не может быть оформлен при неверном ИНН.");
    }

    public static boolean checkINN(Long INN) {
        int len = INN.toString().length();
        return len <= 12 && len >= 10;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Введите ваше ФИО: ");
        String name = String.format("%s %s %s", s.next(), s.next(), s.next());
        System.out.println("Введите ваш ИНН: ");
        long INN = s.nextLong();

        Client c = new Client(name, INN);
        buy(c);
    }
}
