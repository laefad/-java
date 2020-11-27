package com.company.Current.Pr24.Part2.Chairs;

import com.company.Current.Pr24.Part2.Chair;

public class MagicChair implements Chair {

    @Override
    public int getAge() {
        return -10_000;
    }

    @Override
    public String getName() {
        return "Magic chair";
    }

    @Override
    public void use() {
        System.out.println("You seat on " + getName() + ", " + getAge());
    }
}
