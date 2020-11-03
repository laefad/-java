package com.company.Current.Pr15;

public class IntIntCollection extends Collection<Integer, Integer> {

    IntIntCollection()
    {
        super();
    }

    public Integer findMax()
    {
        Integer max = null;
        var node = root;
        while (node != null)
        {
            if (max == null)
                max = node.value;
            else if (node.value > max)
                max = node.value;
            node = node.next;
        }
        return max;
    }

    public Integer findMin()
    {
        Integer min = null;
        var node = root;
        while (node != null)
        {
            if (min == null)
                min = node.value;
            else if (node.value < min)
                min = node.value;
            node = node.next;
        }
        return min;
    }

    public Double findAverage()
    {
        Integer avr = 0;
        Integer amount = 0;
        if (root == null)
            return null;
        var node = root;
        while (node != null)
        {
            amount++;
            avr += node.value;
            node = node.next;
        }
        return ((double) avr) / amount;
    }

    public static void main(String[] args) {
        IntIntCollection coll = new IntIntCollection();
        coll.add(19,12);
        coll.add(10,12);
        coll.print();

        coll.remove(19);
        coll.remove(22);
        coll.print();

        coll.add(32,123);
        coll.add(42,42);
        coll.print();

        System.out.println("Найдено значение для ключа 32 : " + coll.getElemByKey(32));
        System.out.println(coll.getElemByKey(2323) == null ? "Не найдено значение для ключа 2323" : coll.getElemByKey(2323));

        System.out.println("Найден ключ для значения 12 : " + coll.getElemByValue(12));
        System.out.println(coll.getElemByValue(23213) == null ? "Не найден ключ для значения 23213" : coll.getElemByValue(23213));

        System.out.println("Максимальное значение = " + coll.findMax());
        System.out.println("Минимальное значение = " + coll.findMin());
        System.out.println("Среднее значение = " + coll.findAverage());
    }

}
