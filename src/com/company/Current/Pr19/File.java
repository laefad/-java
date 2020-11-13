package com.company.Current.Pr19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {

    public static final String fileName = "src/com/company/Current/Pr19/file.txt";
    public enum Flags
    {
        WRITE,
        OVERWRITE
    }

    public static void Write(Flags flag, String text)
    {
        try {
            FileWriter writer = new FileWriter(fileName, flag.equals(Flags.WRITE));

            try {
                writer.write(text + '\n');
            } catch (IOException e) {
                System.out.println("Проблема с записью в файл " + fileName);
            } finally {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Не удалось открыть файл " + fileName);
        }
    }

    public static String Read()
    {
        try
        {
            FileReader reader = new FileReader(fileName);
            Scanner sc = new Scanner(reader);
            StringBuilder res = new StringBuilder();

            while (sc.hasNext())
                res.append(sc.nextLine()).append('\n');

            return res.toString();

        } catch (FileNotFoundException e) {
            System.out.println("Не удалось открыть файл " + fileName);
        }

        return null;
    }


    public static void main(String[] args) {
        Write(Flags.OVERWRITE, "Первая строка\nВторая строка");
        System.out.println(Read());
        Write(Flags.WRITE, "Третья строка");
        System.out.println(Read());
        Write(Flags.OVERWRITE, "Первая строка2\nВторая строка2");
        System.out.println(Read());
    }
}
