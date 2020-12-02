package com.company.Current.Pr28;

import java.util.List;

public class IpSelector {
    public static boolean isValidIPv4(String address) {
        //К сожалению, Джава не умеет в именованные группы и условные...
        String EightDotted = "^[0-7]{4}\\.[0-7]{4}\\.[0-7]{4}\\.[0-7]{4}$";
        String TenDotted = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$";
        String SixteenDotted = "^0[xX][0-9A-Fa-f]{2}\\.0[xX][0-9A-Fa-f]{2}\\.0[xX][0-9A-Fa-f]{2}\\.0[xX][0-9A-Fa-f]{2}";
        String Eight = "^[0-7]{12}$";
        String Ten = "^[0-9]{10}$";
        String Sixteen = "^0[xX][0-9A-Fa-f]{8}$";
        return address.matches(EightDotted) || address.matches(TenDotted) || address.matches(SixteenDotted)
                || address.matches(Eight) || address.matches(Ten) || address.matches(Sixteen);
    }

    public static boolean isValidTenIPv4(String address) {
        return isValidIPv4(address) && List.of(address.split("\\.")).stream()
                .map(num -> Integer.parseInt(num) < 256)
                .filter(b -> b)
                .toArray().length == 4;
    }

    public static void main(String[] args) {
        List.of(
                "192.0.2.235",
                "0xC0.0x00.0x02.0xEB",
                "0300.0000.0002.0353",
                "0xC00002EB",
                "3221226219",
                "030000001353",
                "SOmeString",
                "1232131232131",
                "0x1232.131.232.13213"
        ).forEach(el -> System.out.println(el + " -> " + IpSelector.isValidIPv4(el)));

        System.out.println("---------------------");

        List.of(
                "192.0.2.235",
                "238.0.0.0",
                "257.11.11.11",
                "0x1232.131.232.13213"
        ).forEach(el -> System.out.println(el + " -> " + IpSelector.isValidTenIPv4(el)));
    }
}
