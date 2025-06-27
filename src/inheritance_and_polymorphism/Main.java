package inheritance_and_polymorphism;


import inheritance_and_polymorphism.HW1.DepositaryAccount;
import inheritance_and_polymorphism.interfaces_example.Circle;
import inheritance_and_polymorphism.interfaces_example.Figure;
import inheritance_and_polymorphism.interfaces_example.Sphere;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50, 50);
        rectangle.showCreationTime();
        Square square = new Square(40);
        square.showCreationTime();

        DepositaryAccount depositaryAccount = new DepositaryAccount(1000);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Circle(40));
        figures.add(new Sphere());
        figures.add(new Square(40));
        figures.add(new Rectangle(40, 20));


    }
}

