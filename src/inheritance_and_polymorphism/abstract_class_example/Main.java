package inheritance_and_polymorphism.abstract_class_example;

import inheritance_and_polymorphism.Rectangle;
import inheritance_and_polymorphism.access_modifiers.private_examples.Private;
import inheritance_and_polymorphism.access_modifiers.private_examples.PrivateChild;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        FigureRectangle figure = new FigureRectangle(Color.blue,40,50);

        System.out.println( figure.getColor());


    }
}
