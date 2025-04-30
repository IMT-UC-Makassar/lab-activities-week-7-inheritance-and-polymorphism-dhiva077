package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.03;
    }

    @Override
    public void transferFunds() {
        System.out.println("SavingsAccount: Transferring funds...");
    }

    @Override
    public void payBills(double amount) {
        balance -= amount;
    }
}
