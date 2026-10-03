// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Loops Assignment
// Task 3: Class Average

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;

        System.out.print("Enter a mark (-1 to finish): ");
        int mark = input.nextInt();

        // -1 is the sentinel: a signal to stop, not a real mark
        while (mark != -1) {
            total += mark;
            count++;
            System.out.print("Enter a mark (-1 to finish): ");
            mark = input.nextInt();
        }

        if (count > 0) {
            double average = (double) total / count;
            System.out.println("Marks entered: " + count);
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No marks entered");
        }

        input.close();
    }
}
