package com.company.Current.Pr3;

import java.awt.*;

public class HumanTest
{
    public static void main(String[] args) {
        test();
    }

    public static void test()
    {
        Human hero = new Human(
                new Color(21,243,90),
                10,
                1000,
                1000);
        hero.head.sayHi();
        hero.arms.throw_items(10);
        System.out.println("Durability last = " + hero.arms.getDurability());
        hero.legs.walk(100000);
        System.out.println( "Human body size = " + hero.body.getSize() );
    }
}
