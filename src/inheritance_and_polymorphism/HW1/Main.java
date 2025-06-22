package inheritance_and_polymorphism.HW1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Account -------------------------------------------------------");
        Account account = new Account(100);
        account.addBalance(30);
        account.showBalance();
        account.withdrawFromBalance(40);
        account.showBalance();

        System.out.println("DepositaryAccount -------------------------------------------------------");
        DepositaryAccount depositaryAccount = new DepositaryAccount(1000);
        depositaryAccount.addBalance(300);
        depositaryAccount.showBalance();
        depositaryAccount.withdrawFromBalance(40);
        depositaryAccount.showBalance();

        System.out.println("CardAccount -------------------------------------------------------");
        CardAccount cardAccount = new CardAccount(500);
        cardAccount.addBalance(100);
        cardAccount.showBalance();
        cardAccount.withdrawFromBalance(40);
        cardAccount.showBalance();
    }
}

