package com.company.Current.Pr3;

import java.awt.*;

public class Human
{
    public class Head
    {
        private Color hairColor;

        public Color getHairColor()
        {
            return hairColor;
        }

        public void setHairColor(Color color)
        {
            hairColor = color;
        }

        Head (Color color)
        {
            setHairColor(color);
        }

        public void sayHi()
        {
            System.out.println("Hi!");
        }


    }

    public class Body
    {
        private int size;

        public void setSize(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        Body (int size)
        {
            setSize(size);
        }
    }

    public class Legs
    {
        private int durability;

        public int getDurability() {
            return durability;
        }

        public void setDurability(int durability) {
            if (durability < 0)
                throw new Error("Durability must be greater than 0");
            this.durability = durability;
        }

        Legs (int durability)
        {
            setDurability(durability);
        }

        public void walk(int meters)
        {
            if (durability < meters)
                System.out.println("Not enough durability");
            else
                durability -= meters;
        }
    }

    public class Arms
    {
        private int durability;

        public int getDurability() {
            return durability;
        }

        public void setDurability(int durability) {
            if (durability < 0)
                throw new Error("Durability must be greater than 0");
            this.durability = durability;
        }

        Arms (int durability)
        {
            setDurability(durability);
        }

        public void throw_items(int amount)
        {
            if (durability < amount)
                System.out.println("Not enough durability");
            else
                durability -= amount;
        }
    }

    public Head head;
    public Body body;
    public Legs legs;
    public Arms arms;

    Human(Color c, int size, int legs_durability, int arms_durability)
    {
        head = new Head(c);
        body = new Body(size);
        legs = new Legs(legs_durability);
        arms = new Arms(arms_durability);
    }

}
