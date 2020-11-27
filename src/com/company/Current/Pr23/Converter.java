package com.company.Current.Pr23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int len = sc.nextInt();

        Integer[] arr = new Integer[len];

        System.out.println("Введите " + len + " чисел: ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();

        List list = convert(arr);

        System.out.println("Список: ");
        for (var elem : list)
            System.out.println(elem);
    }

    public static <T> List<T> convert(T[] arr){
        List<T> list = new ArrayList<>();

        for (T elem : arr)
            list.add(elem);

        return list;
    }

}
