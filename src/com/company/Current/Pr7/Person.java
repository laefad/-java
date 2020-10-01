package com.company.Current.Pr7;

import java.util.ArrayList;

public class Person {
    private ArrayList<Furniture> basket;
    private double money;

    public double paid(double pay)
    {
        if (money < pay)
            return -1;

        money -= pay;
        return pay;
    }

    public void addFurniture(Furniture f)
    {
        basket.add(f);
    }

    public void printAll()
    {
        System.out.println("Person money = " + money + "$");
        System.out.println("Person furniture:");
        for (Furniture f : basket)
        {
            System.out.println(f.getType() + ", price = " + f.getPrice()
                    + "$, color = " + f.getColor().toString()
                    + ", volume = " + f.getVolume() / 1e6 + " m^3");
        }
    }

    Person(double money)
    {
        this.money = money;
        basket = new ArrayList<Furniture>(10);
    }
}
