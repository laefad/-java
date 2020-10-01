package com.company.Current.Pr7;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> content;

    Furniture buyFurniture(Person p)
    {
        Furniture last = content.remove(0);
        if (last == null)
            return null;
        if ( p.paid(last.getPrice()) == -1)
            return null;
        else return last;
    }

    void addFurniture(Furniture f)
    {
        content.add(f);
    }

    FurnitureShop()
    {
        content = new ArrayList<Furniture>(10);
    }
}
