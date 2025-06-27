package inheritance_and_polymorphism.polymorphism_example;

import inheritance_and_polymorphism.Rectangle;
import inheritance_and_polymorphism.Square;
import inheritance_and_polymorphism.interfaces_example.Circle;
import inheritance_and_polymorphism.interfaces_example.Figure;
import inheritance_and_polymorphism.interfaces_example.Sphere;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figuress = new ArrayList<>();
        figuress.add(new Circle(40));
        figuress.add(new Sphere());
        figuress.add(new Square(40));
        figuress.add(new Rectangle(40, 20));

    }
}
