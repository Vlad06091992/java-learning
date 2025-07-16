package eight_exceptions.src;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Set commands = new HashSet() {
        {
            add("add");
            add("list");
            add("remove");
            add("count");
            add("help");
        }
    };
    private static String addCommand = "add Василий Петров " +
            "vasily.petrov@gmail.com +79215637722";
    private static String commandExamples = "\t" + addCommand + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static String commandError = "Wrong command! Available command examples: \n" +
            commandExamples;
    private static String helpText = "Command examples:\n" + commandExamples;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();
        for (; ; ) {
            try {
                String command = scanner.nextLine();
                String[] tokens = command.split("\\s+", 2);
                validateUserInput(tokens);
                switch (tokens[0]) {
                    case "add" -> executor.addCustomer(tokens[1]);
                    case "list" -> executor.listCustomers();
                    case "remove" -> executor.removeCustomer(tokens[1]);
                    case "count" -> System.out.println("There are " + executor.getCount() + " customers");
                    case "help" -> System.out.println(helpText);
                    default -> System.out.println(commandError);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void validateUserInput(String[] tokens) throws Exception {

        switch (tokens[0]) {
            case "add":
                String[] data = tokens[1].trim().split(" ");
                if (data.length != 4) {
                    throw new IllegalArgumentException("недостаточно данных для добавления записи");
                }

                String mail = data[2];
                boolean isValidEmail = mail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
                if (!isValidEmail) {
                    throw new Exception("не валидный емайл");
                }

//                String phone = data[2];
                String phone = "+79623163431";
                boolean isValidPhone = phone.matches("^\\+7\\d{10}$");
                if (!isValidPhone) {
                    throw new Exception("не валидный номер телефона");
                }
                break;
        }


        if (!commands.contains(tokens[0])) {
            throw new IllegalArgumentException("неизвестная команда");
        }
    }


}
