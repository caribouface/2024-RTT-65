package org.jonathonstephens.introductiontojavabasics;

public class SavingsAccount {

    private static double annualInterestRate; // Static member for interest rate
    private double savingsBalance;

    // Constructor
    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    // Calculate monthly interest and add to balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;

    }

    // Static method to modify interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Get the current balance
    public double getBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2
 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.03);
        // 3% interest rate

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 balance after 1 month: $" + saver1.getBalance());

        System.out.println("Saver 2 balance after 1 month: $" + saver2.getBalance());

        SavingsAccount.modifyInterestRate(0.04); // 4% interest rate

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 balance after 2 months: $" + saver1.getBalance());

        System.out.println("Saver 2 balance after 2 months: $" + saver2.getBalance());
    }
}