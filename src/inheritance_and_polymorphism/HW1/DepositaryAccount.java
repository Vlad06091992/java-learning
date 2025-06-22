package inheritance_and_polymorphism.HW1;

import java.time.LocalDateTime;
import java.time.Duration;

public class DepositaryAccount extends Account {

    private LocalDateTime lastWithDrawDate = LocalDateTime.now();
    public DepositaryAccount(int balance){
        super(balance);
    }

    public void addBalance(int count) {
        super.addBalance(count);
        lastWithDrawDate = LocalDateTime.now();
    }

    public void withdrawFromBalance(int count) {
         LocalDateTime current = LocalDateTime.now();
        long minutesBetween = Duration.between(current, lastWithDrawDate).toMinutes();
        if(Math.abs(minutesBetween) >= 1){
            balance -= count;

        } else {
            System.out.println("В данный момент вы не можете снять деньги с депозитарного счета, попробуйте позднее");
        }
    }
}
