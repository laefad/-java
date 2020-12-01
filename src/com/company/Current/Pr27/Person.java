package com.company.Current.Pr27;

public class Person {
    private String family;
    private String name;
    private String fatherName;

    Person (String family, String name, String fatherName) {
        this.family = family;
        this.name = name;
        this.fatherName = fatherName;
    }

    Person (String family, String name) {
        this.family = family;
        this.name = name;
        this.fatherName = "";
    }

    Person (String family) {
        this.family = family;
        this.name = "";
        this.fatherName = "";
    }

    String getFullName() {
        StringBuilder result = new StringBuilder();
        result.append(family).append(" ");
        if (name.length() > 1)
            result.append(name.toUpperCase().charAt(0)).append(". ");
        if (fatherName.length() > 1)
            result.append(fatherName.toUpperCase().charAt(0)).append(". ");
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Person("Marley", "Bob", "Nesta").getFullName());

        System.out.println(new Person("Marley", "Bob").getFullName());

        System.out.println(new Person("Marley").getFullName());
    }
}
