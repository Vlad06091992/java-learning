package nine_files.write_in_file_example;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            if(false) {
                PrintWriter writter = new PrintWriter("src/nine_files/write_in_file_example/data.txt");
                for (int i = 0; i < 1000; i++) {
                    writter.write(i + "\n");
                }

                writter.flush();
                writter.close();
            } else {
                ArrayList<String> list = new ArrayList<>();
                for (int i = 1000; i > 0; i--) {
                    list.add(Integer.toString(i));
                }
                System.out.println("Пишем");
                Files.write(Paths.get("src/nine_files/write_in_file_example/data.txt"),list);

            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
