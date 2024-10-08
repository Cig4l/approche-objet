package fr.diginamic.banque;

public class CompteTaux extends Compte {
    private double rate;

    public CompteTaux(double rate, double accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
        this.rate = rate;
    }

    @Override
    public String toString() {
        String account = super.toString();
        return account + "\ntaux : " + this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

//    public static class Credit extends Operation {
//        public Credit(String date, double amount) {
//            super(date, amount);
//        }
//    }
//
//    public static class Debit extends Operation {
//        public Debit(String date, double amount) {
//            super(date, amount);
//        }
//    }
}
