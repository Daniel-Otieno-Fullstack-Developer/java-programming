// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Exceptions Assignment
// Task 2: Fare Splitter

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int trip = 1; trip <= 2; trip++) {
            System.out.print("Total taxi fare (KES): ");
            int fare = input.nextInt();
            System.out.print("Number of people sharing: ");
            int people = input.nextInt();

            try {
                int each = fare / people;     // int / 0 throws ArithmeticException
                int left = fare % people;
                System.out.println("  Each pays KES " + each + ", KES " + left + " left over");
            } catch (ArithmeticException e) {
                System.out.println("  Cannot split between 0 people (" + e.getMessage() + ")");
            }
        }

        input.close();
    }
}
