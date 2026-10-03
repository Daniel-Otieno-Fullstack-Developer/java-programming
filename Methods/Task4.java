// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Methods Assignment
// Task 4: Grade Method

import java.util.Scanner;

public class Task4 {

    // Returns the grade letter for a mark, using the Delhi College bands
    static char gradeFor(int mark) {
        if (mark >= 70) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else if (mark >= 40) {
            return 'D';
        }
        return 'E';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many marks? ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Mark " + i + ": ");
            int mark = input.nextInt();
            System.out.println("  Grade " + gradeFor(mark));
        }

        input.close();
    }
}
