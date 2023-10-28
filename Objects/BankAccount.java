package Objects;

public class BankAccount {
    // balance attribute
    private double balance;
    // constructor
    public BankAccount (double openingBalance) {
        balance = openingBalance;
    }
    public void deposit (double amount) {
        balance = balance + amount;
    }
    public void withdraw (double amount) {
        balance = balance - amount;
    }
    public void display() {
        System.out.println("Your balance = " + balance);
    }
}
