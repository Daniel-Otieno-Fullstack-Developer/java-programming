// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Arrays Assignment
// Task 2: Class Marks

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students? ");
        int count = input.nextInt();
        int[] marks = new int[count];   // the size is chosen when the program runs

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Mark for student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];
        int total = 0;
        for (int mark : marks) {
            total += mark;
            if (mark > highest) {
                highest = mark;
            }
            if (mark < lowest) {
                lowest = mark;
            }
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Average: " + (double) total / marks.length);

        input.close();
    }
}
