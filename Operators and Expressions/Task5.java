// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Operators and Expressions Assignment
// Task 5: Average Mark

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mark 1: ");
        int mark1 = input.nextInt();
        System.out.print("Mark 2: ");
        int mark2 = input.nextInt();
        System.out.print("Mark 3: ");
        int mark3 = input.nextInt();

        int total = mark1 + mark2 + mark3;

        // int / int throws away the decimal part
        int wrongAverage = total / 3;
        // casting total to double first keeps it
        double average = (double) total / 3;
        // Math.round gives the nearest whole mark
        long rounded = Math.round(average);

        System.out.println("Total: " + total);
        System.out.println("Average without a cast: " + wrongAverage);
        System.out.println("Average with a cast:    " + average);
        System.out.println("Rounded average:        " + rounded);

        input.close();
    }
}
