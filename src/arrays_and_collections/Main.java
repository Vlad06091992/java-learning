package arrays_and_collections;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final ArrayList<String> todolist = new ArrayList<>();
    private static final HashSet<String> emails = new HashSet<>();

    public static void main(String[] args) {
//        arraysCreate();
//        arraysIterations();
//        reverseIteration();
//        nestedArray();
//        HW51();
//        ArrayListExample();
        HashMapExample();

        while (true) {
//            HW52();
//            HW53();
        }

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

    public static void nestedArray() {

        int[][] array = {{1, 2, 3, 4}, {5, 6, 3, 2}, {8, 6, 5, 3}};

        for (int i = 0; i < array.length; i++) {

            System.out.println("Class №" + i);
            System.out.println("Students quantity: " + array[i].length);

            for (int j = 0; j < array[i].length; j++) {
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

    public static void ArrayListExample() {

        ArrayList<String> todolist = new ArrayList<>();
        ArrayList<String> quickAdd = new ArrayList<>() {{
            add("раз");
            add("два");
            add("три");
        }};

        quickAdd.add("четыре");
        quickAdd.remove(2);

        for (String item : quickAdd) {
            System.out.println(
                    item
            );
        }

        System.out.println(quickAdd.size());


        todolist.add("Первое наше дело");
        //список сдвигается
        todolist.add(0, "Второе наше дело");
        // выбросится исклоючение так как добавлять можно либо в конец, либо в существующий индекс
//        todolist.add(5,"Второе наше дело");

        for (int i = 0; i < todolist.size(); i++) {
            System.out.println(todolist.get(i));

        }

        for (String item : todolist) {
            System.out.println(item);
        }
    }

    public static void HW52() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду:");
        String userInput = scanner.nextLine();


        String[] words = userInput.split(" ");

        String command = words[0];

        if (command.equalsIgnoreCase(String.valueOf(Commands.ADD))) {

            try {
                if (words.length > 2) {

                    String index = words[1];

                    try {
                        if (Integer.parseInt(index) <= todolist.size()) {
                            String[] business = Arrays.copyOfRange(words, 2, words.length);
                            int numIndex = Integer.parseInt(index);
                            todolist.add(numIndex, String.join(" ", business));
                            System.out.println("todolist size after added: " + todolist.size());
                        } else {
                            System.out.println("Не могу вставить строку так индекс не соответствует размеру списка");
                        }
                    } catch (Exception e) {
                        String[] business = Arrays.copyOfRange(words, 1, words.length);
                        todolist.add(String.join(" ", business));
                        System.out.println("todolist size after added: " + todolist.size());
                    }
                }

                if (words.length == 2) {
                    String business = words[1];
                    todolist.add(business);
                    System.out.println("todolist size after added: " + todolist.size());
                }

            } catch (Exception e) {
                System.out.println(e);
            }


        } else if (command.equalsIgnoreCase(String.valueOf(Commands.DELETE))) {

            try {
                String index = words[1];
                int numIndex = Integer.parseInt(index);
                todolist.remove(numIndex);
            } catch (Exception e) {
                System.out.println("Не получилось удалить элемент");
            }
        } else if (command.equalsIgnoreCase(String.valueOf(Commands.LIST))) {

            System.out.println("LIST_COMMAND");
            System.out.println("todolist size : " + todolist.size());


            for (int i = 0; i < todolist.size(); i++) {
                System.out.println(i + ": " + todolist.get(i));
            }

        } else if (command.equalsIgnoreCase(String.valueOf(Commands.EDIT))) {


            try {
                String index = words[1];
                if (Integer.parseInt(index) <= todolist.size()) {
                    String[] business = Arrays.copyOfRange(words, 2, words.length);
                    int numIndex = Integer.parseInt(index);
                    todolist.set(numIndex, String.join(" ", business));
                    System.out.println("todolist size after added: " + todolist.size());
                } else {
                    System.out.println("Не могу вставить строку так индекс не соответствует размеру списка");
                }

            } catch (Exception e) {
                System.out.println("Не удалось обновить документ");
            }

        }


    }

    public enum Commands {
        ADD, DELETE, EDIT, LIST
    }

    public static void hashSetTreeSetExample() {
        HashSet<String> wordsHashSet = new HashSet<>();

        wordsHashSet.add("один");
        wordsHashSet.add("два");
        wordsHashSet.add("три");
        wordsHashSet.add("два");

        // элементы хранятся в отсортированном порядке
        TreeSet<String> wordsTreeSet = new TreeSet<>();

        wordsTreeSet.add("один");
        wordsTreeSet.add("два");
        wordsTreeSet.add("три");
        wordsTreeSet.add("два");


    }

    public static void HW53() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду:");
        String userInput = scanner.nextLine();
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        String[] words = userInput.split(" ");
        String command = words[0];


        if (command.equalsIgnoreCase(String.valueOf(Commands.LIST))) {
            for (String email : emails) {
                System.out.println(email);
            }

        } else if (command.equalsIgnoreCase(String.valueOf(Commands.ADD))) {

            String email = words[1];

            // Компилируем регулярное выражение
            Pattern pattern = Pattern.compile(emailRegex);

            //Matcher для выполнения проверки
            Matcher matcher = pattern.matcher(email);

            boolean matches = matcher.matches();

            if (matches) {
                emails.add(email);
            } else {
                System.out.println("Введите корректный емайл");
            }
        }


    }

    public static void HashMapExample() {
//        HashMap<String, Integer> buys = new HashMap<>();

        // отсортировано по аналогии с TreeSet
        TreeMap<String, Integer> buys = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        if (false) {
            //положить значение по ключу
            buys.put("ключ", 3);
            //достать значение по ключу
            buys.get("ключ");
            //удалить значение по ключу
            buys.remove("ключ");
        }

        while (true) {
//        for(;;){
            String userInput = scanner.nextLine();

            if (userInput.equals(String.valueOf(Commands.LIST))) {
                showBuys(buys);
                continue;
            } else {

                if (buys.containsKey(userInput)) {
                    buys.put(userInput, buys.get(userInput) + 1);
                } else {
                    buys.put(userInput, 1);
                }
            }

        }
    }

    public static void showBuys(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }

}