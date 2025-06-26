package inheritance_and_polymorphism.access_modifiers.protected_example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Protected protectedEx = new Protected();
        //приватное свойство, не можем менять
        //privateEx.color = 'dd'

        //могу работать с protected свойствами и методами класса извне в рамках одного пакета
        //но будет недосутупны извне в рамках другого пакета
        protectedEx.isUpdated = true;
        protectedEx.sayPhrase("я экземпляр класса protected");


        ProtectedChild protectedChild = new ProtectedChild();
        protectedChild.sayPhrase("protectedChild использует метод класса protected напрямую");
        protectedChild.protectedChildHello("protectedChild использует метод класса protected в данном методе");

    }
}
