package oop.lab;

public class BusinessAccount extends BankAccount {

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05;
    }

    @Override
    public void transferFunds() {
        System.out.println("BusinessAccount: Transferring funds...");
    }

    // Menambahkan metode applyForLoan
    public void applyForLoan(double amount) {
        System.out.println("BusinessAccount: Applying for a loan of " + amount);
        // Implementasi logika pengajuan pinjaman
    }

    // Menambahkan metode checkLoanStatus
    public String checkLoanStatus() {
        // Mengembalikan status pinjaman
        return "BusinessAccount: Loan status is pending.";
    }
}
