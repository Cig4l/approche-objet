package fr.diginamic.banque;

public class Compte {
    private double accountNumber;
    private double accountBalance;

    public Compte(double accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "numéro de compte : " + this.accountNumber + "\nsolde du compte : " + this.accountBalance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
