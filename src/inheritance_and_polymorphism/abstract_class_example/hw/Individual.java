package inheritance_and_polymorphism.abstract_class_example.hw;

public class Individual extends Client {
    public Individual(double settlementAccount) {
        super(settlementAccount);
    }

    @Override
    public double withdrawMoney(double amount) {
        this.settlementAccount -= amount;
        return amount;
    }

    @Override
    public double depositMoney(double amount) {
        this.settlementAccount += amount;
        return amount;
    }
}
