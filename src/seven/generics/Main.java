package seven.generics;

import LambdaExpressions.src.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import static LambdaExpressions.src.Main.loadStaffFromFile;

public class Main {

    public static void main(String[] args){
        LRUCache<Employee> cache = new LRUCache<>(5);
        ArrayList<Employee> staff = loadStaffFromFile();


        staff.forEach(cache::addElement);

        cache.getAllElement().forEach(System.out::println);



    }
}
