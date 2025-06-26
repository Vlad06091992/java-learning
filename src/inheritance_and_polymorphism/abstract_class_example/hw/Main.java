package inheritance_and_polymorphism.abstract_class_example.hw;

public class Main {

    public static void main(String[] args) {
        Individual individual = new Individual(1000.0);

        individual.depositMoney(30);
        individual.withdrawMoney(300);
        System.out.println(individual.checkBalance());

        IndividualEntrepreneur individualEntrepreneur = new IndividualEntrepreneur(1000.0);

        individualEntrepreneur.depositMoney(30);
        individualEntrepreneur.withdrawMoney(300);
        System.out.println(individualEntrepreneur.checkBalance());

        LegalEntity legalEntity = new LegalEntity(1000.0);

        legalEntity.depositMoney(30);
        legalEntity.withdrawMoney(300);
        System.out.println(legalEntity.checkBalance());

    }

}
