import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }

        balance = balance - amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(balance);

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
