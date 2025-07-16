package nine_files.HW9_5;

import java.io.File;
import java.util.Arrays;

public class Main {

    static double commonSize = 0;

    public static void main(String[] args) {
        String rootFolderPath = "C:/Users/Admin/Desktop/Рабочая папка/ЧПУ/RUSSIANQTN";

        File folder = new File(rootFolderPath);
        //смотрим файлы в папке
        File[] files = folder.listFiles();

        Arrays.stream(files).forEach(file -> addFolderSize(file));
        System.out.println(commonSize);
    }

    public static void addFolderSize(File folder){

            File[] files = folder.listFiles();
            if(files != null) {

                Arrays.stream(files).forEach(file -> {

                    if (file.isDirectory()) {
                        addFolderSize(file);
                        System.out.println("Это папка:" + file.getName());
                    } else {
                        commonSize += file.length();
                        System.out.println("Это файл:" + file.getName());
                    }
                });
            }
    }
}
