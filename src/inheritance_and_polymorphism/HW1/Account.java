package inheritance_and_polymorphism.HW1;

public class Account {

    protected double balance;

    public Account(int balance){
        this.balance = balance;
    }

    public void addBalance(int count) {
        balance += count;
    }

    public void withdrawFromBalance(int count) {
        balance -= count;
    }

    public void showBalance(){
        System.out.println(balance);
    }
}
