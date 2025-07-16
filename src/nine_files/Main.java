package nine_files;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/Admin/Desktop/работа/страны.txt");
        File file2 = new File("src/LambdaExpressions/data/staff.txt");
        System.out.println(file.length()); //размер
        System.out.println(file2.lastModified()); //последнее изменение
        System.out.println(file2.delete()); //удаление
        System.out.println(file2.isDirectory()); //файл или папка по указанному пути?

        File folder = new File("C:/Users/Admin/Desktop");
        //смотрим файлы в папке
        File files[] = folder.listFiles();


        System.out.println(Arrays.toString(files));

        //создать папку
        File newFolder = new File("C:/Users/Admin/Desktop/project_folder");
        newFolder.mkdir();
        //удалить папку
        newFolder.delete();


    }
}
