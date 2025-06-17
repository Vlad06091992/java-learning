package arrays_and_collections;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        arraysCreate();
//        arraysIterations();
//        reverseIteration();
//        nestedArray();
        HW51();
    }

    public static void arraysCreate() {
//        int[] roomsCount = new int[6];
//        roomsCount[0] = 6;
//        roomsCount[1] = 26;
//        roomsCount[2] = 36;
//        roomsCount[3] = 46;


        String colorsString = "каждый охотник желает знать где сидит фазан";

        String[] colorsArray = colorsString.split(",?\\s+");

        System.out.println(Arrays.toString(colorsArray));

        int[] roomsCount = {4, 6, 36, 26};
        String[] colors = {"Красный", "Зеленый", "Оранжевый", "Желтый"};

        // массив определенной длины, остальные значения по умолчанию
        System.out.println(Arrays.toString(roomsCount));

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

    }

    public static void arraysIterations() {

        String[] colors = {"Красный", "Зеленый", "Оранжевый", "Желтый"};

//        for (int i = 0; i < colors.length; i++){
//            System.out.println(colors[i]);
//        }

        for (String colorWord : colors) {
            System.out.println(colorWord);
        }

        int[] tickets = new int[1000];

        int[] winTickets = new int[10];

        for (int i = 0; i < tickets.length; i++) {
            int value = 1000000 + (int) Math.round(Math.random() * 1000000);
//            System.out.println(value);
            tickets[i] = value;

            if (i % 100 == 0) {
                winTickets[i / 100] = value;
            }

        }

//        System.out.println(Arrays.toString(winTickets));

        for (int item : winTickets) {
            System.out.println(item);
        }


    }

    public static void reverseIteration() {

        String colorsString = "каждый каждый охотник желает знать знать где сидит фазан";
        String[] array = colorsString.split(" ");

        System.out.println(Arrays.toString(array));


        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            String curr = array[i];


            if (i > 0) {
                String prev = array[i - 1];

                if (curr.equals(prev)) {
                    continue;
                }

            }
            System.out.println(curr);

        }


        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i].equals(array[i - 1])) {
                continue;
            }
            System.out.println(array[i]);

        }

    }

    public static void nestedArray(){

        int[][] array = {{1,2,3,4},{5,6,3,2},{8,6,5,3}};

        for (int i = 0; i < array.length; i++) {

            System.out.println("Class №" + i );
            System.out.println("Students quantity: " + array[i].length );

            for (int j = 0; j < array[i].length ; j++) {
                System.out.println(array[i][j]);
            }

        }


    }


    public static void HW51() {
        String[][] matrix = {
                {"x", " ", " ", " ", " ", " ", "x"},
                {" ", "x", " ", " ", " ", "x", " "},
                {" ", " ", "x", "x", "x", " ", " "},
                {" ", " ", " ", "x", " ", " ", " "},
                {" ", " ", "x", "x", "x", " ", " "},
                {" ", "x", " ", " ", " ", "x", " "},
                {"x", " ", " ", " ", " ", " ", "x"}
        };

        for (int i = 0; i < matrix.length; i++) {
            // Присоединение элементов массива в строку с разделителем ""
            String result = String.join("", matrix[i]);
            System.out.println(result);
        }
    }


}