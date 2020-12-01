package com.company.Current.Pr27;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public static Shirt parse (String str)
    {
        Shirt s = new Shirt();
        String[] res = str.split(",");
        s.id = res[0];
        s.name = res[1];
        s.color = res[2];
        s.size = res[3];

        return s;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirts1 = new Shirt[shirts.length];

        for (int i = 0; i < shirts.length; i++) {
            shirts1[i] = Shirt.parse(shirts[i]);
        }

        for (var s : shirts1)
            System.out.println(s);

    }

}
