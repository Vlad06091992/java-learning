package inheritance_and_polymorphism.access_modifiers.private_examples;

import java.awt.*;

public class Private {

    //приватное свойство
    //1) не можем использовать из вне
    // 2) не можем напрямую использовать в наследниках, но можем использовать через геттеры и сеттеыры в наследниках если они определены в родителе
    // вместе с приватным методом
    //
    private Color color;


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public  Private (Color color){
        this.color = color;

    }
}


