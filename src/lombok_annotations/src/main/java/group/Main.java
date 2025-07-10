package lombok_annotations.src.main.java.group;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Examples ex = new Examples("id");

        ex.some();

        ex.setName("Федя");

        System.out.println("результат работы аннотаций которые создают геттер и сеттер - " + ex.getName());

        String res = ex.toString();

        System.out.println("результат работы аннотации @ToString - " + res);


        Employee emp = new Employee("Иван",20000, new Date());

        System.out.println(emp.getName());
        System.out.println(emp.toString());

    }

}

