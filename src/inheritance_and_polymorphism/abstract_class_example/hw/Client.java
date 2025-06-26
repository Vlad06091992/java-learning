package inheritance_and_polymorphism.abstract_class_example.hw;

public abstract class Client {
    protected double settlementAccount;

    Client(double settlementAccount) {
        this.settlementAccount = settlementAccount;
    }

    abstract public double withdrawMoney(double money);

    abstract public double depositMoney(double money);

    public double checkBalance() {
        return this.settlementAccount;
    }
}
