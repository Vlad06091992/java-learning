package inheritance_and_polymorphism.interface_comparable_example;

import inheritance_and_polymorphism.Square;
import inheritance_and_polymorphism.interface_comparator_example.SquareComparator;

import java.util.TreeSet;

public class Main {

public static void main(String[] args) {
        TreeSet<Square> squares = new TreeSet<>(new SquareComparator());
        squares.add(new Square(40));
        squares.add(new Square(20));
        squares.add(new Square(10));
        squares.add(new Square(15));
        squares.add(new Square(41));
        squares.add(new Square(32));
        squares.add(new Square(28));

        for (Square square: squares){
            System.out.println(square.getSquare());
        }

    }
}
