package inheritance_and_polymorphism.access_modifiers.protected_example;

import java.awt.*;

public class Protected {

    protected boolean isUpdated;


    public void setIsUpdated(Boolean status){
        this.isUpdated = status;
    }

    protected void sayPhrase(String phrase){
        System.out.println(phrase);
    }
}


