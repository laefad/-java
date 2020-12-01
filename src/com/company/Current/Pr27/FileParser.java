package com.company.Current.Pr27;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class FileParser {

    public static void main(String[] args) throws IOException
    {
        //path = src/com/company/Current/Pr27/test.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileReader(reader.readLine()));

        String str = scanner.nextLine();

        StringBuilder result = getLine(str.split("\\s"));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String[] words) {
        if (words == null || words.length == 0)
            return new StringBuilder();
        if ("".equals(words[0]) || words.length == 1)
            return new StringBuilder(words[0]);

        StringBuilder result = new StringBuilder();

        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

        //Перемешиваем, пока не угадаем
        while (!isOK(list))
            Collections.shuffle(list);

        for (String s : list)
            result.append(s).append(" ");

        result.deleteCharAt(result.length()-1);
        return result;
    }

    public static boolean isOK(ArrayList<String> list)
    {
        for (int i = 0; i < list.size()-1; i++)
        {
            String first = list.get(i);
            String second = list.get(i+1);
            first = first.toLowerCase();
            second =second.toLowerCase();
            if (first.charAt(first.length()-1)!=second.charAt(0))
                return false;
        }
        return true;
    }
}
