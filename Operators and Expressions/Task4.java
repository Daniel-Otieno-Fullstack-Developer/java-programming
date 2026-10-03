// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Operators and Expressions Assignment
// Task 4: Cash Withdrawal Notes

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Amount to withdraw (KES): ");
        int amount = input.nextInt();

        // Each step takes as many notes as fit, then keeps the remainder
        int thousands = amount / 1000;
        amount = amount % 1000;
        int fiveHundreds = amount / 500;
        amount = amount % 500;
        int twoHundreds = amount / 200;
        amount = amount % 200;
        int hundreds = amount / 100;
        amount = amount % 100;
        int fifties = amount / 50;
        int coins = amount % 50;

        System.out.println("1000 notes: " + thousands);
        System.out.println(" 500 notes: " + fiveHundreds);
        System.out.println(" 200 notes: " + twoHundreds);
        System.out.println(" 100 notes: " + hundreds);
        System.out.println("  50 notes: " + fifties);
        System.out.println("In coins:   KES " + coins);

        input.close();
    }
}
