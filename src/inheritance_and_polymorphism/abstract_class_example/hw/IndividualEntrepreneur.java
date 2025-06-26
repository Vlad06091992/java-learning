package inheritance_and_polymorphism.abstract_class_example.hw;

public class IndividualEntrepreneur extends Individual {
    public IndividualEntrepreneur(double settlementAccount) {
        super(settlementAccount);
    }

    @Override
    public double withdrawMoney(double amount) {
        this.settlementAccount -= amount * 0.01;
        this.settlementAccount -= amount;
        return amount;
    }

    @Override
    public double depositMoney(double amount) {

        if (amount < 1000.) {
            this.settlementAccount -= amount * 0.01;
        } else if (
                amount >= 1000
        ) {
            this.settlementAccount -= amount * 0.005;
        }
        return super.depositMoney(amount);
    }
}

