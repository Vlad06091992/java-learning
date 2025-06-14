package primitives_and_objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a = "Дмитрий";
        String b = "Василий";

        //проверка на то что они одинаковы
        System.out.println(a.equals(b));

        //используется для сравнения двух строк лексикографически
        System.out.println(a.compareTo(b));

        //используется для сравнения двух строк лексикографически без учета регистра
        System.out.println(a.compareToIgnoreCase(b));


    }


}
