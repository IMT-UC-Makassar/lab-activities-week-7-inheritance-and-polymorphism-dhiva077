package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        deposit(balance * 0.05);
    }

    public void transferFunds(double amount, String destinationAccount) {
        withdraw(amount);
    }

    // Menambahkan metode applyForLoan
    public void applyForLoan(double amount) {
        System.out.println("BusinessAccount: Applying for a loan of " + amount);
        // Implementasi logika pengajuan pinjaman
    }

    // Menambahkan metode checkLoanStatus
    public String checkLoanStatus() {
        // Mengembalikan status pinjaman
        return "Pending";
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