// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Operators and Expressions Assignment
// Task 6: Temperature Converter

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Temperature in Celsius: ");
        double celsius = input.nextDouble();

        // 9 / 5 uses int division and gives 1, so this answer is wrong
        double wrong = celsius * (9 / 5) + 32;
        // 9.0 / 5 is 1.8, and * happens before + without extra brackets
        double fahrenheit = celsius * 9.0 / 5 + 32;

        System.out.println("Wrong (9 / 5):   " + wrong + " F");
        System.out.println("Right (9.0 / 5): " + fahrenheit + " F");

        input.close();
    }
}
