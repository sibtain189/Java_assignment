package Java_assignment.unit_4.week_3.day_1.Question_2;

public class InsufficientFundException extends Exception {

    public InsufficientFundException(String message) {
        super(message);
    }

}


class SavingAccount{

    int accountNumber;

    double balance;

    void deposit(int amount){
        balance += amount;

    }

    double withdraw(double amount) throws InsufficientFundException{

        if (balance<amount){
            throw new InsufficientFundException("Insufficient Amount in the Account");

        }else {
            balance -= amount;
            return balance;
        }
    }

}