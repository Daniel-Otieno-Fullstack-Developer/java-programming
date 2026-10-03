// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Data Types and Variables Assignment
// Task 3: Duka Receipt

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Item name: ");
        var item = input.nextLine();          // var works out that this is a String
        System.out.print("Price per kg (KES): ");
        var pricePerKg = input.nextDouble();  // ...and that this is a double
        System.out.print("Kilograms bought: ");
        var kilograms = input.nextDouble();

        var total = pricePerKg * kilograms;   // double * double gives a double

        System.out.println();
        System.out.println("Item:   " + item);
        System.out.println("Price:  KES " + pricePerKg + " per kg");
        System.out.println("Weight: " + kilograms + " kg");
        System.out.println("Total:  KES " + total);

        input.close();
    }
}
