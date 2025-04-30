package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {

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

    @Override
    public void payBills(double amount) {
        balance -= amount;
    }
}