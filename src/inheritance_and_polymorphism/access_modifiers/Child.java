package inheritance_and_polymorphism.access_modifiers;

public class Child extends Parent {
    public void printSecret() {
        // Нельзя: System.out.println(secret); // Ошибка компиляции!
        // Нельзя: saySecret(); // Ошибка компиляции!
        saySecret();
    }
}