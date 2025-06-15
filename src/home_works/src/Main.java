package home_works.src;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        getSum("Вася заработал 5000 рублей, Маша - 30000 рублей, а Петя - 7563 рубля");
//        getFullname();
//
//        for (Words word : Words.values()) {
//            System.out.println(word.getRussianName());
//        }


//        parsePhone();
        getBirthDayDay();
    }

    public static void getSum(String string) {

        int result = 0;

        String[] words = string.split(" ");

        for (String word : words) {
            try {
                result += Integer.parseInt(word);
            } catch (Exception e) {
                System.out.println(e);

            }

        }

        System.out.println(result);

    }


    public static void getFullname() {
        int index = 0;
        String res = "";
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        String[] array = userInput.split(" ");
        String field = "";
        for (String word : array) {
            switch (index) {
                case 0:
                    field = Words.lAST_NAME.getRussianName();
                    break;
                case 1:
                    field = Words.FIRST_NAME.getRussianName();
                    break;
                case 2:
                    field = Words.PATRONYMIC.getRussianName();
                    break;
            }

            res += field + ": " + (word.length() > 1 ? word : "Инициалы " + word) + "\n";
            index++;
        }

        System.out.println(res);
    }

    public static void parsePhone() {


        String resultPhone = "";

        String phone = "+7962316-34-31";
        String regex = "\\D";

        String cleanedPhone = phone.replaceAll(regex, "");


        int length = cleanedPhone.length();

        if (cleanedPhone.matches("^[^78].*") && length == 10) {
            resultPhone = "+7" + cleanedPhone;
        } else if (cleanedPhone.charAt(0) == '8' && length == 11) {
            resultPhone = '+' + cleanedPhone.replaceFirst("^8", "7");
        } else if (cleanedPhone.charAt(0) == '7' && length == 11) {
            resultPhone = '+' + cleanedPhone;
        }

        System.out.println(resultPhone);


    }

    public static void getBirthDayDay() {

        int age = 33;

        Calendar calendar = Calendar.getInstance();
        calendar.set(1992, Calendar.SEPTEMBER, 6);
        DateFormat dayFormat = new SimpleDateFormat("EEEE");


        for (int i = 0; i <= age; i++) {
            if (i > 0) calendar.add(Calendar.YEAR, 1);

            String day = dayFormat.format(calendar.getTime());


            System.out.println("Возраст: " + (i) + " " + day);
        }

    }

    public enum Words {
        FIRST_NAME("Имя"),
        lAST_NAME("Фамилия"),
        PATRONYMIC("Отчество");

        private String russianName;

        Words(String russianName) {
            this.russianName = russianName;
        }

        public String getRussianName(
        ) {
            return this.russianName;

        }

    }


}
