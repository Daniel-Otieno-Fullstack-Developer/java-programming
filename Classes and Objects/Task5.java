// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Classes and Objects Assignment
// Task 5: Bank Account

import java.util.Scanner;

class BankAccount {
    private final String owner;
    private double balance;

    BankAccount(String owner, double openingBalance) {
        this.owner = owner;
        this.balance = openingBalance;
    }

    double getBalance() {
        return balance;
    }

    String getOwner() {
        return owner;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Returns false instead of letting the balance go below zero
    boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount("Halima Abdi", 5000);
        System.out.println(account.getOwner() + " opens with KES " + account.getBalance());

        System.out.print("Deposit (KES): ");
        account.deposit(input.nextDouble());
        System.out.println("Balance: KES " + account.getBalance());

        for (int i = 1; i <= 2; i++) {
            System.out.print("Withdraw (KES): ");
            double amount = input.nextDouble();
            if (account.withdraw(amount)) {
                System.out.println("Done. Balance: KES " + account.getBalance());
            } else {
                System.out.println("Refused: that would overdraw the account");
            }
        }

        input.close();
    }
}
