package LambdaExpressions.src;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static String staffFile = "src/LambdaExpressions/data/staff.txt";


    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));

        ArrayList<Employee> staff = loadStaffFromFile();



        //найти максимальную зарплату среди тех кто пришел в 2017 году
        Optional<Employee> result = staff.stream()
                .filter(e -> e.getWorkStart()
                        .toString().contains("2017"))
                .max(Comparator.comparing(Employee::getSalary));

        result.ifPresent(System.out::println);
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