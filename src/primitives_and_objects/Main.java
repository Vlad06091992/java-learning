package primitives_and_objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a = "Дмитрий";
        String b = "Василий";
        if (true) {
            long start = System.currentTimeMillis();

            for (int i = 0; i < 80000; i++) {
                a += b;
            }

            long end = System.currentTimeMillis();

            //Duration:3754ms
            System.out.println(a.length()); //560007
            System.out.println("Duration: " + (end - start) + "ms");
        } else {
            long start = System.currentTimeMillis();

            StringBuilder builder = new StringBuilder();

            builder.append(a);

            for (int i = 0; i < 80000; i++) {
                builder.append(b);
            }

            long end = System.currentTimeMillis();

            //Duration:7ms
            System.out.println(builder.length()); //560007
            System.out.println("Duration: " + (end - start) + "ms");
        }
    }


}
