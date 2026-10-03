// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Decisions Assignment
// Task 8: Mobile Money Menu

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        final int AIRTIME = 100;
        int balance = 5000;
        Scanner input = new Scanner(System.in);

        System.out.println("=== DELHI PESA ===");
        System.out.println("1. Check balance");
        System.out.println("2. Send money");
        System.out.println("3. Buy KES 100 airtime");
        System.out.print("Choose an option: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Your balance is KES " + balance);
            case 2 -> {
                System.out.print("Amount to send (KES): ");
                int amount = input.nextInt();
                if (amount <= 0) {
                    System.out.println("Amount must be more than zero");
                } else if (amount > balance) {
                    System.out.println("Failed: not enough money");
                } else {
                    balance -= amount;
                    System.out.println("Sent KES " + amount + ". New balance: KES " + balance);
                }
            }
            case 3 -> {
                balance -= AIRTIME;
                System.out.println("Airtime bought. New balance: KES " + balance);
            }
            default -> System.out.println("Invalid option");
        }

        input.close();
    }
}
