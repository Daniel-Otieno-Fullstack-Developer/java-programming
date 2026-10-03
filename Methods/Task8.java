// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Methods Assignment
// Task 8: Mini Calculator

import java.util.Scanner;

public class Task8 {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    // Uses the four methods above to work out one answer
    static void calculate(double a, char op, double b) {
        switch (op) {
            case '+' -> System.out.println("Answer: " + add(a, b));
            case '-' -> System.out.println("Answer: " + subtract(a, b));
            case '*' -> System.out.println("Answer: " + multiply(a, b));
            case '/' -> {
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Answer: " + divide(a, b));
                }
            }
            default -> System.out.println("Unknown operator " + op);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        double first = input.nextDouble();
        System.out.print("Operator (+ - * /): ");
        char op = input.next().charAt(0);
        System.out.print("Second number: ");
        double second = input.nextDouble();

        calculate(first, op, second);

        input.close();
    }
}
