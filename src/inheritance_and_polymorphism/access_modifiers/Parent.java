package inheritance_and_polymorphism.access_modifiers;

public class Parent {
    private int secret = 42;

    protected void saySecret() {
        System.out.println(secret);
    }
}

