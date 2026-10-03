// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Loops Assignment
// Task 2: Chama Savings

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Monthly contribution (KES): ");
        int contribution = input.nextInt();
        System.out.print("Number of months: ");
        int months = input.nextInt();

        int total = 0;   // declared before the loop so it keeps its value
        for (int month = 1; month <= months; month++) {
            total += contribution;
            System.out.println("Month " + month + ": KES " + total);
        }
        System.out.println("Saved after " + months + " months: KES " + total);

        input.close();
    }
}
