package oop.lab;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.01;
    }

    @Override
    public void transferFunds() {
        System.out.println("CheckingAccount: Transferring funds...");
    }

    
    public void payBills(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Paying bills: " + amount + " has been deducted from your account.");
        } else {
            System.out.println("Insufficient funds to pay bills.");
        }
    }
}
