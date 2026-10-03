// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Operators and Expressions Assignment
// Task 8: Loan Eligibility

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        final int MIN_AGE = 18;
        final int MIN_INCOME = 15000;
        Scanner input = new Scanner(System.in);

        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.print("Monthly income (KES): ");
        int income = input.nextInt();
        System.out.print("Has a guarantor (true/false): ");
        boolean hasGuarantor = input.nextBoolean();
        System.out.print("Has an unpaid loan (true/false): ");
        boolean hasUnpaidLoan = input.nextBoolean();

        boolean isAdult = age >= MIN_AGE;
        // Enough income OR someone to guarantee the loan
        boolean canRepay = income >= MIN_INCOME || hasGuarantor;
        // Must be an adult AND able to repay AND have NO unpaid loan
        boolean eligible = isAdult && canRepay && !hasUnpaidLoan;

        System.out.println("Adult: " + isAdult);
        System.out.println("Can repay: " + canRepay);
        System.out.println("Eligible for a loan: " + eligible);

        input.close();
    }
}
