package inheritance_and_polymorphism.abstract_class_example.hw;

public class LegalEntity extends Individual {
    public LegalEntity(double settlementAccount) {
        super(settlementAccount);
    }

    @Override
    public double withdrawMoney(double amount) {
        this.settlementAccount -= amount * 0.01;
        super.withdrawMoney(amount);
        return amount;
    }
}
