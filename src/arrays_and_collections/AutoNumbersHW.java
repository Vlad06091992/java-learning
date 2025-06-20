package arrays_and_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AutoNumbersHW {

    private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static char[] letters = {'С', 'М', 'Т', 'В', 'А', 'Р', 'О', 'Н', 'Е', 'У', 'Х', 'К'};


    private static ArrayList<String> carLicensePlates = new ArrayList();

    public static void main(String args[]) {

        Arrays.sort(letters);

//        // А З33 АА 197
//        // СМТВАРОНЕУ
//
//        ArrayList<String> list = new ArrayList<>();
//        HashSet<String> set = new HashSet<>();
//        set.addAll(list);
//
//        Scanner scanner = new Scanner(System.in);
//        for (; ; ) {
//            // Прямой перебор list.contains()
//            // Бинарный поиск Collections.binarySearch()
//            // TreeSet
//            // HashSet
//        }
        prepareСarLicensePlates();
    }

    private static void prepareСarLicensePlates() {



        //пример для быстрой конкатенации строк
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello");
//        sb.append(", ");
//        sb.append("world!");
//        String result = sb.toString();




        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < letters.length; k++) {
                    for (int l = 1; l <= 197; l++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(letters[i]);

                        sb.append(j);
                        sb.append(j);
                        sb.append(j);

                        sb.append(letters[i]);
                        sb.append(letters[i]);

                        if(l < 9){
                            sb.append(String.valueOf(0));
                            sb.append(String.valueOf(0));
                            sb.append(String.valueOf(l));
                        } else if(l < 99) {
                            sb.append(String.valueOf(0));
                            sb.append(String.valueOf(l));
                        }
                        else {
                            sb.append(String.valueOf(l));
                        }

                        carLicensePlates.add(sb.toString());
                    }
                }


            }


        }


        System.out.println(carLicensePlates.size());
//        System.out.println(carLicensePlates.contains("А222АА121"));
        System.out.println(carLicensePlates.contains("У000НУ001"));




    }
}

