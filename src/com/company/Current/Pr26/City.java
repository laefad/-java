package com.company.Current.Pr26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    private String name;
    private String country;

    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public static void main(String[] args) {

        List<City> cities = new ArrayList<City>() {{
            add(new City("Гамбург", "Германия"));
            add(new City("Берлин", "Германия"));
            add(new City("Москва", "Россия"));
            add(new City("Москва", "Россия"));
            add(new City("Шанхай", "Китай"));
            add(new City("Пекин", "Китай"));
            add(new City("Чунцин", "Китай"));
        }};

        Map<String, ArrayList<String>> citiesMap = new HashMap<>();

        cities.forEach( city -> {
            if (citiesMap.containsKey(city.getCountry()))
                citiesMap.get(city.getCountry()).add(city.getName());
            else
                citiesMap.put(city.getCountry(), new ArrayList<>(){{
                    add(city.getName());
                }});
        });

        citiesMap.forEach((key, value) ->
                System.out.println(key + ": " + value)
        );
    }
}
