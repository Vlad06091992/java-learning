package primitives_and_objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Math.random
        double a = Math.random() * (double) 10;
        System.out.println("Значение a: " + a);
        System.out.println("целое значение a: " + (int) a);

        //Math.random
        double b = 3.7;
        int roundedB = (int) Math.round(b);
        System.out.println("округленное значение roundedB: " + roundedB);

        //Math.random
        int c = 9;
        int squareRoot = (int) Math.sqrt(c);
        System.out.println("квадратный корень с: " + squareRoot);


        //Math.random
        int d = 9;
        int degree = 20;
        int result = (int) Math.pow(d,degree);
        System.out.println("результат возведения в степень: " + result);

        /*
        Math.max..
        Math.min..
        Math.PI..
        Math.E..

        итд
         */
    }


}
