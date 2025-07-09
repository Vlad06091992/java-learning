package seven.maven_example;

import LambdaExpressions.src.Employee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            String data = getDataFromFile("src/seven/maven_example/staff.json");
            System.out.println(data);
            JSONParser parser = new JSONParser();
            JSONArray array = (JSONArray) parser.parse(data);

            for(Object item:array){
                JSONObject object = (JSONObject) item;
                System.out.println(object);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static String getDataFromFile(String path) {
        StringBuilder builder = new StringBuilder();

        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (String line : lines) {
                builder.append(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return builder.toString();


    }
}


//    public static ArrayList<Employee> loadStaffFromFile() {
//        ArrayList<Employee> staff = new ArrayList<>();
//        try {
//            List<String> lines = Files.readAllLines(Paths.get(staffFile));
//            for (String line : lines) {
//                String[] fragments = line.split("\t");
//                if (fragments.length != 3) {
//                    System.out.println("Wrong line: " + line);
//                    continue;
//                }
//                staff.add(new Employee(
//                        fragments[0],
//                        Integer.parseInt(fragments[1]),
//                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
//                ));
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return staff;
//    }

