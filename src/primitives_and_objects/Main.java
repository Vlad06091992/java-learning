package primitives_and_objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String phone = "7(962)316-34-31";

        System.out.println(phone.replaceAll("[^0-9]", ""));

        String text = "Дмитрий петрович ждет Вас.      Выходите через 5 минут";
        String[] sentences = text.split("\\.\\s+");

        for (String sentence : sentences) {
            System.out.println(sentence);
        }

    }


}
