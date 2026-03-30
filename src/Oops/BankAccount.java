package Oops;

public class BankAccount {
	private double balance;

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(300);
        System.out.println("Balance: " + acc.getBalance());
    }
}
