package nine_files.FileInputStream_example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        try {
            FileInputStream is = new FileInputStream("C:/Users/Admin/Desktop/работа/страны.txt");

            for (;;){
                int code = is.read();
                builder.append((char) code);
                if (code < 0) break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(builder.toString());
    }

}
