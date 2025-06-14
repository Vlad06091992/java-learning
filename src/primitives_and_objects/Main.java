package primitives_and_objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "какой-то текст";
        System.out.println(text.length());
        System.out.println(text.indexOf('о'));
        System.out.println(text.lastIndexOf('о'));

        int spaceIndex = text.indexOf(' ');

        System.out.println(text.substring(0,spaceIndex + 1));
        System.out.println(text.substring(spaceIndex + 1));

        String text_text = "     какой-то текст                 ";
        System.out.println(text_text.trim());

    }


}
