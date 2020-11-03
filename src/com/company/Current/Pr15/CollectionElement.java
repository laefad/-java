package com.company.Current.Pr15;

public class CollectionElement<Key, Value> {
    public Key key;
    public Value value;
    public CollectionElement<Key, Value> next;
    public CollectionElement<Key, Value> prev;

    CollectionElement(Key key, Value value)
    {
        this.key = key;
        this.value = value;
        next = null;
        prev = null;
    }

}
