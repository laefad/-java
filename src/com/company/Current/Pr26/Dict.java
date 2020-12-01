package com.company.Current.Pr26;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Dict {
    public static void main(String[] args) {
        Map<String, String> names = Map.of(
                "Василий", "Пупкин",
                "Полиграф", "Полиграфыч",
                "Николай", "Золотой",
                "Владимир", "Дятлов",
                "Петр", "Синичкин",
                "Максим", "Кислов",
                "Иван", "Добров",
                "Пупкин", "Василий",
                "Кирилл", "Дворов",
                "Абрывгл", "Пупкин"
        );

        System.out.println("До: " + names);

        Set<String> setNames = new HashSet<>();

        names = names.entrySet()
                .stream()
                .filter(entry -> setNames.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));


        System.out.println("После: " + names);
    }
}
