package com.company.Current.Pr16;

import java.util.*;

public class Player {
    private Deque<Card> cards;

    public String name;

    public void addCards(Card one, Card two)
    {
        cards.add(one);
        cards.add(two);
    }

    public Card showCard()
    {
        if (cards.isEmpty()) return null;
        return cards.pop();
    }

    public boolean empty()
    {
        return cards.isEmpty();
    }

    Player(String name, int[] numbers)
    {
        this.name = name;
        this.cards = new LinkedList<>();
        for (var index : numbers)
            cards.add(new Card(index));
    }

}
