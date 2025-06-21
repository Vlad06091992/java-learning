package arrays_and_collections;

import java.util.*;

public class AutoNumbersHW {

    private static final int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final char[] letters = {'С', 'Ц','Г','Ч','Д', 'М', 'Т', 'В', 'А', 'Р', 'О', 'Н', 'Е', 'У', 'Х', 'К'};
    final static int regionsCount = 999;

    private static final ArrayList<String> carLicensePlates = new ArrayList();
    private static final HashSet<String> carLicensePlatesHashSet = new HashSet<>();
    private static final TreeSet<String> carLicensePlatesTreeSet = new TreeSet<>();
    private static final String item = "У000НУ00143434";


    public static void main(String args[]) {
        prepareСarLicensePlates();
        performLinearSearchInList();
        performBinarySearchOnSortedList();
        carLicensePlatesHashSet.addAll(carLicensePlates);
        performSearchInHashSet();
        carLicensePlatesTreeSet.addAll(carLicensePlates);
        performSearchInTreeSet();

    }

    private static void prepareСarLicensePlates() {
        long timerStart = System.currentTimeMillis();
        System.out.println("Начало генерации номеров автомобилей");
        Arrays.sort(letters);
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int l = 1; l <= regionsCount; l++) {
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
                                sb.append(String.valueOf(0));
                                sb.append(String.valueOf(l));
                            } else if (l < 99) {
                                sb.append(String.valueOf(0));
                                sb.append(String.valueOf(0));
                                sb.append(String.valueOf(l));
                            } else if (l < 999) {
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

        long timerFinish = System.currentTimeMillis();
        System.out.println("Генерация закончена, вставка совершалась " + (timerFinish - timerStart) + "ms");
        System.out.println("Количество номеров: " + carLicensePlates.size());
    }

    private static void performLinearSearchInList() {
        long timerStart = System.currentTimeMillis();
        System.out.println("Начало поиска в ArrayList, количество записей: " + carLicensePlates.size());
        boolean result = carLicensePlates.contains(item);
        long timerFinish = System.currentTimeMillis();
        System.out.println("Поиск в ArrayList закончен, поиск совершалася " + (timerFinish - timerStart) + "ms" + ", результат: " + result);
    }

    private static void performBinarySearchOnSortedList() {
        Collections.sort(carLicensePlates);
        long timerStart = System.currentTimeMillis();
        System.out.println("Начало поиска в ArrayList с помощью binarySearch, количество записей: " + carLicensePlates.size());
        int index = Collections.binarySearch(carLicensePlates, item);
        System.out.println("Индекс: " + index);
        long timerFinish = System.currentTimeMillis();
        System.out.println("Поиск в ArrayList с помощью binarySearch закончен, поиск совершалася " + (timerFinish - timerStart) + "ms" + ", результат: " + index);
    }


    private static void performSearchInHashSet() {
        long timerStart = System.currentTimeMillis();
        System.out.println("Начало поиска в HashSet, количество записей: " + carLicensePlatesHashSet.size());
        boolean result = carLicensePlatesHashSet.contains(item);
        long timerFinish = System.currentTimeMillis();
        System.out.println("Поиск в HashSet закончен, поиск совершалася " + (timerFinish - timerStart) + "ms" + ", результат: " + result);
    }

    private static void performSearchInTreeSet() {
        long timerStart = System.currentTimeMillis();
        System.out.println("Начало поиска в TreeSet, количество записей: " + carLicensePlatesTreeSet.size());
        boolean result = carLicensePlatesHashSet.contains(item);
        long timerFinish = System.currentTimeMillis();
        System.out.println("Поиск в TreeSet закончен, поиск совершалася " + (timerFinish - timerStart) + "ms" + ", результат: " + result);
    }
}

