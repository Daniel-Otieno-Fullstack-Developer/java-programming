// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Loops Assignment
// Task 7: Seating Plan

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of rows: ");
        int rows = input.nextInt();
        System.out.print("Seats per row: ");
        int seats = input.nextInt();

        System.out.println();
        // The outer loop picks the row, the inner loop prints every seat in it
        for (int r = 0; r < rows; r++) {
            char rowLetter = (char) ('A' + r);
            for (int s = 1; s <= seats; s++) {
                System.out.print(rowLetter + "" + s + " ");
            }
            System.out.println();   // end of the row
        }
        System.out.println("Total seats: " + rows * seats);

        input.close();
    }
}
