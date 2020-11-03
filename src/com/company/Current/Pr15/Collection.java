package com.company.Current.Pr15;

public class Collection<Key, Value> {
    protected CollectionElement<Key, Value> root;

    public Collection()
    {
        root = null;
    }

    public void print()
    {
        var node = root;
        System.out.println("Collection: ");
        while (node != null)
        {
            System.out.println(node.key + " : " + node.value);
            node = node.next;
        }
    }

    public boolean add(Key key, Value value)
    {
        if (root == null)
        {
            root = new CollectionElement<>(key, value);
            return true;
        }
        var node = root;
        while (node != null)
        {
            if (node.key == key)
                return false;
            else if (node.next == null)
            {
                node.next = new CollectionElement<>(key, value);
                node.next.prev = node;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public boolean remove(Key key)
    {
        if (root == null)
            return false;
        if (root.key == key) {
            if (root.next != null)
            {
                root = root.next;
                root.prev.next = null;
                root.prev = null;
            }
            else
                root = null;
            return true;
        }
        var node = root;
        while (node != null)
        {
            if (node.key == key)
            {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                node.next = null;
                node.prev = null;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public Value getElemByKey(Key key)
    {
        var node = root;
        while (node != null)
        {
            if (node.key == key)
                return node.value;
            node = node.next;
        }
        return null;
    }

    public Key getElemByValue(Value value)
    {
        var node = root;
        while (node != null)
        {
            if (node.value == value)
                return node.key;
            node = node.next;
        }
        return null;
    }

}
