// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Loops Assignment
// Task 1: Fuel Price Table

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Price of one litre (KES): ");
        int pricePerLitre = input.nextInt();

        System.out.println("Litres\tCost (KES)");
        // A for loop that counts in steps of 5 instead of 1
        for (int litres = 5; litres <= 30; litres += 5) {
            System.out.println(litres + "\t" + (litres * pricePerLitre));
        }

        input.close();
    }
}
