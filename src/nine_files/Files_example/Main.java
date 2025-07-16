package nine_files.Files_example;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        try {
            List<String> lines = Files.readAllLines(Paths.get("C:/Users/Admin/Desktop/работа/страны.txt"));

            lines.forEach(l -> builder.append(l + '\n'));
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(builder.toString());
    }

}
