// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Decisions Assignment
// Task 5: ATM Withdrawal

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        final int CORRECT_PIN = 4321;
        int balance = 8500;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        int pin = input.nextInt();

        if (pin == CORRECT_PIN) {
            System.out.print("Amount to withdraw (KES): ");
            int amount = input.nextInt();

            // Only checked once the PIN is right: a nested decision
            if (amount % 100 != 0) {
                System.out.println("Amount must be in hundreds");
            } else if (amount > balance) {
                System.out.println("Insufficient funds. Balance: KES " + balance);
            } else {
                balance -= amount;
                System.out.println("Please take your cash: KES " + amount);
                System.out.println("New balance: KES " + balance);
            }
        } else {
            System.out.println("Wrong PIN. Card retained.");
        }

        input.close();
    }
}
