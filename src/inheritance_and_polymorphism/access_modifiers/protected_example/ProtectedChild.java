package inheritance_and_polymorphism.access_modifiers.protected_example;


import java.awt.*;

public class ProtectedChild extends Protected {
    public ProtectedChild() {
        super.isUpdated = true;
    }

    public void protectedChildHello(String phrase){
        super.sayPhrase(phrase);
//        this.sayPhrase(phrase);
    }
}