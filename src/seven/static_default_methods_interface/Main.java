package seven.static_default_methods_interface;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args){

//        пример статического метода интерфейса Comparator.reverseOrder()
        TreeSet<String> list = new TreeSet<>(Comparator.reverseOrder());
    }
}
