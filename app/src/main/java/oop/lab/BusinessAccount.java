package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {

    private String loanStatus = "None";

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05;
    }

    @Override
    public void transferFunds(double amount, String destinationAccount) {
        System.out.println("BusinessAccount: Transferring funds...");
    }

    @Override
    public void payBills(double amount) {
        balance -= amount;
    }

    @Override
    public void applyForLoan(double amount) {
        loanStatus = "Pending";
    }

    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }
}