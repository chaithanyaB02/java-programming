
class BankAccount {

    // Private variables
    private int accountNumber;
    private double balance;

    // Static variable
    static int accountCount = 0;

    // Final variable
    final int accountId;

    // Constructor
    BankAccount(int accountNumber, double balance, int accountId) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountId = accountId;

        accountCount++;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Get balance method
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: " + balance);
    }
}

