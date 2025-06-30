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

//        Collections.sort(staff, new Comparator<Employee>() {
//
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                int salary1 = o1.getSalary();
//                int salary2 = o2.getSalary();
//                if (salary1 > salary2) return 1;
//                if (salary1 < salary2) return -1;
//                return o1.getName().compareTo(o2.getName());
//
//            }
//        });


        Collections.sort(staff, (o1, o2) -> {
            int salary1 = o1.getSalary();
            int salary2 = o2.getSalary();
            if (salary1 > salary2) return 1;
            if (salary1 < salary2) return -1;
            return o1.getName().compareTo(o2.getName());

        });

        for (Employee item : staff) {
            System.out.println(item);
        }

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