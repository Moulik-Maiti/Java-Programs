import java.util.Scanner;

abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;
    Accounts(int accountNumber, String accountHoldersName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = balance;
    }
    abstract void withdrawal(double amount);
    abstract void deposit(double amount);
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Accounts {
    double rateOfInterest;
    SavingsAccount(int accountNumber, String accountHoldersName,String address, double balance, double rateOfInterest) {
        super(accountNumber, accountHoldersName, address, balance);
        this.rateOfInterest = rateOfInterest;
    }
    void withdrawal(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit Successful");
    }
    void calculateAmount() {
        double interest = (balance * rateOfInterest) / 100;
        double total = balance + interest;
        System.out.println("Interest Amount: " + interest);
        System.out.println("Total Amount After Interest: " + total);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter Balance:");
        double balance = sc.nextDouble();

        System.out.println("Enter Rate of Interest:");
        double roi = sc.nextDouble();

        SavingsAccount s = new SavingsAccount(accNo, name, address, balance, roi);

        System.out.println("Enter Deposit Amount:");
        double dep = sc.nextDouble();
        s.deposit(dep);

        System.out.println("Enter Withdrawal Amount:");
        double wd = sc.nextDouble();
        s.withdrawal(wd);

        s.display();

        s.calculateAmount();
    }
}
