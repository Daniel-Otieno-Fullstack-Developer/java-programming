// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - ArrayList and Collections Assignment
// Task 2: Marks Summary

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // A list holds objects, so int marks are stored as Integer (autoboxing)
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter marks separated by spaces: ");
        Scanner line = new Scanner(input.nextLine());
        while (line.hasNextInt()) {
            marks.add(line.nextInt());
        }
        line.close();

        int total = 0;
        for (int mark : marks) {        // unboxing: Integer back to int
            total += mark;
        }

        System.out.println("Marks entered: " + marks.size());
        System.out.println("Highest: " + Collections.max(marks));
        System.out.println("Lowest: " + Collections.min(marks));
        System.out.printf("Average: %.2f%n", (double) total / marks.size());

        Collections.sort(marks);
        System.out.println("Sorted: " + marks);

        input.close();
    }
}
