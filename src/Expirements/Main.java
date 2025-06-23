package Expirements;

import inheritance_and_polymorphism.access_modifiers.RectangleExample;

public class Main {

    public static void main(String[] args) {
        showManAndAddress();
    }

    public static void showManAndAddress() {
        Man Vlad = new Man("Vlad", 32, "63", "Воронова");

        System.out.println(Vlad.age);
        System.out.println(Vlad.name);
        System.out.println(Vlad.address.flat);
        System.out.println(Vlad.address.street);

        // в рамках другого пакета не  могу обратиться к protected свойству
        RectangleExample rectangle = new RectangleExample(90,50);
//        rectangle.width = 40;
//
//        System.out.println(rectangle.width);

    }
}
