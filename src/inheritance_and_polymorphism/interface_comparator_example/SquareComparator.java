package inheritance_and_polymorphism.interface_comparator_example;

import inheritance_and_polymorphism.Square;

import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square square1, Square square2) {

        int squareFirst = square1.getSquare();
        int squareSecond = square2.getSquare();

        if (squareFirst > squareSecond) return 1;
        if (squareFirst < squareSecond) return -1;
        return 0;
    }
}