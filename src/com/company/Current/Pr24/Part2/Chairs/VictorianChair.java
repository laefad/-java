package com.company.Current.Pr24.Part2.Chairs;

import com.company.Current.Pr24.Part2.Chair;

public class VictorianChair implements Chair {
    @Override
    public int getAge() {
        return 1800;
    }

    @Override
    public String getName() {
        return "Victorian chair";
    }

    @Override
    public void use() {
        System.out.println("You seat on " + getName() + ", " + getAge());
    }
}
