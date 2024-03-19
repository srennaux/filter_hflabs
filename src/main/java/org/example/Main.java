package org.example;

public class Main {
    public static void main(String[] args) {
        String regExp = "(\\d{6})\\s(\\D+)\\s(\\d)\\s";
        String replacement = "$1 $2 ";

        Filter myFilter = new Filter(regExp, replacement);

        String address1 = "140002 ЛЮБЕРЦЫ 2 ОКТЯБРЬСКИЙ ПР 123/4";
        String address2 = "143095 ГОЛИЦЫНО 5 ПАРКОВАЯ 7";
        String address3 = "123459 МОСКВА 1 МОЛОСТОВЫХ 19";

        String result1 = myFilter.filter(address1);
        String result2 = myFilter.filter(address2);
        String result3 = myFilter.filter(address3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}