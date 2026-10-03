// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Exceptions Assignment
// Task 7: Wallet with a Custom Exception

import java.util.Scanner;

// A checked exception of our own, carrying the amount that was missing
class InsufficientFundsException extends Exception {
    private static final long serialVersionUID = 1L;
    private final double shortBy;

    InsufficientFundsException(double shortBy) {
        super("short by KES " + shortBy);
        this.shortBy = shortBy;
    }

    double getShortBy() {
        return shortBy;
    }
}

class Wallet {
    private double balance;

    Wallet(double balance) {
        this.balance = balance;
    }

    void pay(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Wallet wallet = new Wallet(1200);

        for (int i = 1; i <= 2; i++) {
            System.out.print("Amount to pay (KES): ");
            double amount = input.nextDouble();
            try {
                wallet.pay(amount);
                System.out.println("  Paid. Balance: KES " + wallet.getBalance());
            } catch (InsufficientFundsException e) {
                System.out.println("  Payment failed: " + e.getMessage());
                System.out.println("  Top up at least KES " + e.getShortBy());
            }
        }

        input.close();
    }
}
