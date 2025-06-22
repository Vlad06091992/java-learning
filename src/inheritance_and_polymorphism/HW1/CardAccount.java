package inheritance_and_polymorphism.HW1;

public class CardAccount extends Account {
    public CardAccount(int balance){
        super(balance);
    }

    public void withdrawFromBalance(int count) {
        super.withdrawFromBalance(count);
        balance -= (count * 0.01);
    }
}
