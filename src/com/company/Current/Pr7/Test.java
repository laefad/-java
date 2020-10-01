package com.company.Current.Pr7;

import java.awt.Color;

public class Test {

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();
        Person ivan = new Person(100);

        shop.addFurniture( new Chair(10, new Color(10,21,255), 2000, 120));
        shop.addFurniture( new Table(10, new Color(0,0,0), 1245, 1000, 120));
        shop.addFurniture( new Drawer(30, new Color(180,82,123), 200,100,100));

        for (int i = 0; i < 3; ++i) {
            Furniture purchase = shop.buyFurniture(ivan);
            ivan.addFurniture(purchase);
            System.out.println("-----------");
            ivan.printAll();
        }
    }
}
