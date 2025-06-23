package inheritance_and_polymorphism.access_modifiers;

public class Main {
    public static void main(String[] args) {
        // в рамках пакета могу обратиться к protected свойству
        RectangleExample rectangle = new RectangleExample(90,50);
        rectangle.width = 40;

        System.out.println(rectangle.width);
        Child child = new Child();
        child.saySecret();

    }
}
