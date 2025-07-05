package LambdaExpressions.src;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static String staffFile = "src/LambdaExpressions/data/staff.txt";


    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));


        ArrayList<Employee> staff = loadStaffFromFile();
        //стрим из arrayList
        Stream<Employee> filterredStaff = staff.stream().filter(el -> el.getSalary() >= 100000);

        //стрим из массива
        int[] numbers = {1, 2, 4, 5, 6, 7, 8, 9};

        IntStream filterrredNumbers = Arrays.stream(numbers).filter(el -> el > 5);

        filterrredNumbers.forEach(System.out::println);

        filterredStaff.forEach(System.out::println);

        // stream из строки
        "аоыдлоалдываолдывоа".chars().forEach(System.out::println);

        // бесконечные стримы
        Stream.iterate(1, (n) -> n +1).forEach(System.out::println);
        Stream.generate(() -> "ааа").forEach(System.out::println);
    }

    private static ArrayList<Employee> loadStaffFromFile() {
        ArrayList<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}