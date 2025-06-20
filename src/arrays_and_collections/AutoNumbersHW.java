package arrays_and_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AutoNumbersHW {

    private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static char[] letters = {'С', 'М', 'Т', 'В', 'А', 'Р', 'О', 'Н', 'Е', 'У', 'Х', 'К'};


    private static ArrayList<String> carLicensePlates = new ArrayList();
    private static HashSet<String> carLicensePlatesSet = new HashSet<>();

    public static void main(String args[]) {

        Arrays.sort(letters);
        prepareСarLicensePlates();
        carLicensePlatesSet.addAll(carLicensePlates);
        System.out.println(carLicensePlatesSet.size());
    }

    private static void prepareСarLicensePlates() {
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                    for (int l = 1; l <= 197; l++) {
                        for (int m = 0; m < letters.length; m++) {
                            for (int n = 0; n < letters.length; n++) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(letters[i]);

                                sb.append(j);
                                sb.append(j);
                                sb.append(j);

                                sb.append(letters[m]);
                                sb.append(letters[n]);

                                if (l < 9) {
                                    sb.append(String.valueOf(0));
                                    sb.append(String.valueOf(0));
                                    sb.append(String.valueOf(l));
                                } else if (l < 99) {
                                    sb.append(String.valueOf(0));
                                    sb.append(String.valueOf(l));
                                } else {
                                    sb.append(String.valueOf(l));
                                }



                                carLicensePlates.add(sb.toString());
                            }
                        }
                    }


            }


        }


        System.out.println(carLicensePlates.size());
//        System.out.println(carLicensePlates.contains("А222АА121"));
        System.out.println(carLicensePlates.contains("У000НУ001"));




    }
}

