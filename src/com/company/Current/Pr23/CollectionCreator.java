package com.company.Current.Pr23;

import java.util.*;

public class CollectionCreator {

    static <T> ArrayList<T> newArrayList (T[] arr)
    {
        return new ArrayList<>(Arrays.asList(arr));
    }

    static <K, V> HashMap<K, V> newHashMap (K[] keys, V[] values)
    {
        assert (keys.length == values.length);
        var hash = new HashMap<K, V>();
        for (int i = 0; i < keys.length; i++)
            hash.put(keys[i], values[i]);
        return hash;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int len = sc.nextInt();

        Integer[] arr = new Integer[len];
        String[] arr2 = new String[len];

        System.out.println("Введите числа, в количестве " + len + ": ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();

        System.out.println("Введите строки, в количестве " + len + ": ");
        for (int i = 0; i < len; i++)
            arr2[i] = sc.next();

        var arrList = newArrayList(arr);
        print(arrList);

        var hash = newHashMap(arr, arr2);
        print(hash.entrySet());
    }

    private static void print(Iterable collection)
    {
        System.out.println("Результат: ");
        for (var elem : collection)
            System.out.println(elem.toString());
    }
}
