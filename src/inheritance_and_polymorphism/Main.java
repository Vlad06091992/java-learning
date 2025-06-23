package inheritance_and_polymorphism;


import inheritance_and_polymorphism.HW1.DepositaryAccount;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50,50);
        rectangle.showCreationTime();
        Square square = new Square(40);
        square.showCreationTime();

        DepositaryAccount depositaryAccount = new DepositaryAccount(1000);
    }
}

