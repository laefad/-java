package com.company.Current.Pr23;

import java.util.List;
import java.util.Scanner;

public class TypeArray <T> {
    private T[] data;

    TypeArray (T[] arr) {
        this.data = arr;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }
    //Задание 3
    public T getElement(int i) {
        assert (i < data.length && i >= 0);
        return data[i];
    }
    //Задание 4
    public static <T> void toListAndPrint(TypeArray<T> t) {
        System.out.println("Список: ");
        List<T> l = Converter.convert(t.data);
        for (int i = 0; i < l.size(); i++)
            if (i == 5) break;
            else System.out.println(l.get(i));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];

        System.out.println("Введите строки, в количестве " + arr.length + ": ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.next();

        TypeArray<String> stringArr = new TypeArray<>(arr);
        //Задание 3
        System.out.println(stringArr.getElement(2));
        try {
            System.out.println(stringArr.getElement(100));
        } catch (Exception e) {
            System.out.println("Элемента с таким индексом нет.");
        }
        try {
            System.out.println(stringArr.getElement(-1));
        } catch (Exception e) {
            System.out.println("Элемента с таким индексом нет.");
        }

        //4 Задание
        toListAndPrint(stringArr);
    }
}