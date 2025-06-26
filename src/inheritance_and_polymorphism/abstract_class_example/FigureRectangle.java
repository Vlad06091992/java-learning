package inheritance_and_polymorphism.abstract_class_example;

import inheritance_and_polymorphism.Rectangle;

import java.awt.*;

public class FigureRectangle extends Figure {

    private int width;
    private int height;

    public FigureRectangle(Color color, int width, int height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getSquare() {
        return width * height;
    }
}
