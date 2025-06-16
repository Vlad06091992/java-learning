package arrays_and_collections;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        arraysCreate();
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

        int[] roomsCount = {4,6,36,26};
        String[] colors = {"Красный","Зеленый","Оранжевый","Желтый"};

        // массив определенной длины, остальные значения по умолчанию
        System.out.println(Arrays.toString(roomsCount));

        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }

    }
}
