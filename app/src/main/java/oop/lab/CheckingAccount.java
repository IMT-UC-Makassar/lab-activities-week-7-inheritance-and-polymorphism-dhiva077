package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService{

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Checking Accounts have no interest.");
    }

    public void transferFunds(double amount, String destinationAccount) {
        withdraw(amount);
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
