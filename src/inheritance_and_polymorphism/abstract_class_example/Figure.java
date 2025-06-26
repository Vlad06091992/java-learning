package inheritance_and_polymorphism.abstract_class_example;

import java.awt.*;

public abstract class Figure {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public abstract double getSquare();
}
