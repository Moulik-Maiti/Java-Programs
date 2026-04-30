interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class Customer {
    String name = "Rahul";
}

class Account extends Customer implements Bank {
    double balance = 5000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account a = new Account();

        a.deposit(2000);
        a.withdraw(1000);
        a.display();
    }
}
