interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void displayDetails();
}

class Customer {
    String customerName;
    String customerID;

    Customer(String name, String id) {
        this.customerName = name;
        this.customerID = id;
    }

    void displayCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerID);
    }
}

class Account extends Customer implements Bank {
    private double balance;
    private final String accNumber;

    Account(String name, String id, String accNo, double initialBalance) {
        super(name, id);
        this.accNumber = accNo;
        this.balance = initialBalance;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    @Override
    public void displayDetails() {
        System.out.println("Bank: Global Trust Bank");
        System.out.println("Account Number: " + accNumber);
        System.out.println("Current Balance: $" + balance);
    }

    public void showCompleteDetails() {
        displayCustomerInfo();
        displayDetails(); 
    }
}
public class Bankapp{
    public static void main(String[] args) {
        Account myAccount = new Account("Moulik Maiti", "A1004", "120056", 3000.0);

        System.out.println("--- Banking Framework Summary ---");
        myAccount.showCompleteDetails();
        
        System.out.println("\n--- Processing Transaction.... ---");
        myAccount.deposit(1500.0);
        myAccount.withdraw(2000.0);
        
        System.out.println("\n--- Details.... ---");
        myAccount.displayDetails();
    }
}
