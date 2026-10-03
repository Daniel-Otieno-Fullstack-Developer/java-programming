// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Operators and Expressions Assignment
// Task 2: Sharing Mandazi

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many mandazi? ");
        int mandazi = input.nextInt();
        System.out.print("How many students? ");
        int students = input.nextInt();

        // Dividing two ints keeps only the whole part
        int each = mandazi / students;
        // % gives what is left over after sharing equally
        int leftOver = mandazi % students;

        System.out.println("Each student gets " + each + " mandazi");
        System.out.println("Left over: " + leftOver);

        input.close();
    }
}
