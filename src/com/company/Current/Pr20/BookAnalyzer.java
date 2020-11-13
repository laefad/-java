package com.company.Current.Pr20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

public class BookAnalyzer {

    public static final String fileName = "src/com/company/Current/Pr20/voyna-i-mir-tom-1";

    public static Map<String, Integer> Analyze() throws IOException {

        Map<String, Integer> dictionary = new LinkedHashMap<>();

        FileReader reader = new FileReader(fileName + ".txt", Charset.forName("windows-1251"));
        Scanner scanner = new Scanner(reader);

        final String regexp = "[.,\\s\\-\\(\\)\\[\\]:\"'?<>]+";

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (String word : line.split(regexp))
                dictionary.put(word,
                        dictionary.containsKey(word) ? dictionary.get(word) + 1: 1
                );
        }

        reader.close();

        return dictionary;
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(
                (c1,c2) -> Integer.compare(0, c1.getValue().compareTo(c2.getValue()))
        );

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public static void PrintTop(int amount, Map<String, Integer> dictionary)
    {
        int counter = 0;
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            if (counter ++ > amount) break;
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(String.format("%s : %d", key, value));
        }
    }

    public static void First() throws IOException {
        // Я без понятия, как он цепляет пробелы
        Map<String, Integer> dictionary = Analyze();
        dictionary = sortByValue(dictionary);
        PrintTop(10, dictionary);
    }

    public static void Second() throws IOException {

        FileReader reader = new FileReader(fileName + ".txt", Charset.forName("windows-1251"));
        FileWriter writer = new FileWriter(fileName + "1.txt");
        Scanner scanner = new Scanner(reader);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.replaceAll("\\s", "#");
            writer.write(line);
        }

        reader.close();
        writer.close();
    }



    public static void main(String[] args) throws IOException {
        First();
        Second();
    }
}
