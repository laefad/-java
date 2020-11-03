package com.company.Current.Pr16;

public class Card {
    private int value;

    public final int max = 9;
    public final int min = 0;

    Card(int val)
    {
        assert (val <= max && val >= min);
        value = val;
    }

    public int getValue()
    {
        return value;
    }
    public boolean greater(final Card card)
    {
        if (card.value == max && value == min) return true;
        if (value == max && card.value == min) return false;
        return card.value < value;
    }

}
