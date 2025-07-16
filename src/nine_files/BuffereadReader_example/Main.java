package nine_files.BuffereadReader_example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/Admin/Desktop/работа/страны.txt"));

            for (; ; ) {
                String line = bufferedReader.readLine();
                if (line == null) break;
                builder.append(line + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(builder.toString());
    }

}
