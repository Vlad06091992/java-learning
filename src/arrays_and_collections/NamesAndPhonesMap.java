package arrays_and_collections;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class NamesAndPhonesMap {

    private static TreeMap<String, Integer> records = new TreeMap<>();
    private static boolean shouldAddPhoneNumber = false;
    private static int newPhone = 0;

    public static void main(String[] args) {

//        while (true) {
        for (;;) {
            command();
        }
    }

    public static void command() {
        if (shouldAddPhoneNumber) {
            System.out.println("неизвестный номер, введите имя человека для записи в контакты :");
        } else {
            System.out.println("Введите номер телефона или команду LIST для отображения списка:");
        }


        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        boolean isInt = isParsableAsInteger(userInput);

        if (shouldAddPhoneNumber && !isInt && newPhone != 0) {
            records.put(userInput, newPhone);
            shouldAddPhoneNumber = false;
            newPhone = 0;
        }


        if (isInt) {
            Object data = gatDataByValue(records, Integer.valueOf(userInput));
            boolean isExistNumber = records.containsValue(Integer.valueOf(userInput));

            if (isExistNumber && data instanceof GetDaTa) {
                System.out.println("имя: " + ((GetDaTa) data).name + ", телефон: " + ((GetDaTa) data).phone);
            } else {
                shouldAddPhoneNumber = true;
                newPhone = (Integer.parseInt(userInput));
            }
        } else {

            if (userInput.equalsIgnoreCase("LIST")) {
                System.out.println(" -----------данные------------");
                for (String key : records.keySet()) {
                    System.out.println(new GetDaTa(key, records.get(key)));
                }
                System.out.println(" -----------------------------");
            }


        }

    }


    public static boolean isParsableAsInteger(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Object gatDataByValue(Map<String, Integer> map, Integer value) {
        Set<String> keys = map.keySet();

        for (String key : keys) {
            if (map.get(key).equals(value)) {
                return new GetDaTa(key, map.get(key));
            }
        }

        return false;

    }

    static class GetDaTa {
        private final String name;
        private final Integer phone;

        public GetDaTa(String name, Integer phone) {
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Имя : " + name + ", Номер телефона : " + phone;
        }
    }
}
