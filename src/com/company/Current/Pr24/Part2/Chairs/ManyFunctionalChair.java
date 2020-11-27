package com.company.Current.Pr24.Part2.Chairs;

import com.company.Current.Pr24.Part2.Chair;

public class ManyFunctionalChair implements Chair {
    @Override
    public int getAge() {
        return 2000;
    }

    @Override
    public String getName() {
        return "ManyFunctionalChair";
    }

    @Override
    public void use() {
        System.out.println("You seat on " + getName() + ", " + getAge());
    }
}
