// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Data Types and Variables Assignment
// Task 4: VAT Calculator

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // The VAT rate never changes while the program runs, so it is a constant
        final double VAT_RATE = 0.16;
        Scanner input = new Scanner(System.in);

        System.out.print("Price before VAT (KES): ");
        double price = input.nextDouble();

        double vat = price * VAT_RATE;
        double totalPrice = price + vat;

        System.out.println("VAT at 16%:  KES " + vat);
        System.out.println("Total price: KES " + totalPrice);

        input.close();
    }
}
