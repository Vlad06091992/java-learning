package inheritance_and_polymorphism.access_modifiers.private_examples;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
         Color white     = new Color(255, 255, 255);
        Private privateEx = new Private(white);
        //приватное свойство, не можем менять
        //privateEx.color = 'dd'


        //геттеры сеттеры для работы с приватным свойством
        privateEx.setColor(Color.BLACK);
        System.out.println(privateEx.getColor());



        //геттеры сеттеры унаследованы и мы можем работать с приватным свойством которое определено в родителе
        PrivateChild privateChildEx = new PrivateChild(Color.BLUE);
        privateChildEx.setColor(Color.ORANGE);
        System.out.println(privateChildEx.getColor());

    }
}
