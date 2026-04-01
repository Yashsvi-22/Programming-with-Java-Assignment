import java.util.Scanner;

class BankAccount {

    int accNo;
    String name;
    double balance;

    BankAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        BankAccount acc = new BankAccount(accNo, name, balance);

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                acc.deposit(amount);
            }

            else if (choice == 2) {
                System.out.print("Enter withdraw amount: ");
                double amount = sc.nextDouble();
                acc.withdraw(amount);
            }

            else if (choice == 3) {
                acc.showBalance();
            }

            else if (choice == 4) {
                System.out.println("Thank you!");
            }

            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
