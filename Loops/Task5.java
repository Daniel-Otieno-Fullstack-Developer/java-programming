// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Loops Assignment
// Task 5: Skip the Absentees

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students on the register? ");
        int students = input.nextInt();

        int total = 0;
        int present = 0;
        for (int i = 1; i <= students; i++) {
            System.out.print("Mark for student " + i + " (-1 if absent): ");
            int mark = input.nextInt();
            if (mark == -1) {
                continue;   // skip the rest of this turn: nothing to add
            }
            total += mark;
            present++;
        }

        System.out.println("Present: " + present + ", absent: " + (students - present));
        if (present > 0) {
            System.out.println("Average of those present: " + (double) total / present);
        }

        input.close();
    }
}
