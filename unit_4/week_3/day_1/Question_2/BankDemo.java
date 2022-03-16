package Java_assignment.unit_4.week_3.day_1.Question_2;

public class BankDemo {

    public static void main(String[] args)  {
        SavingAccount ex = new SavingAccount();
        ex.deposit(2000);
        try {
            ex.withdraw(5000.0);
            System.out.println("your balance is : "+ex.balance);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }

    }
}
