// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Exceptions Assignment
// Task 5: Applicant Checks

import java.util.Scanner;

class Applicant {
    private final String name;
    private final int age;

    Applicant(String name, int age) {
        // throw stops the constructor: no Applicant is created with bad data
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("a name is required");
        }
        if (age < 16 || age > 60) {
            throw new IllegalArgumentException("age " + age + " is outside 16 to 60");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", aged " + age;
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(input.nextLine());
            try {
                Applicant a = new Applicant(name, age);
                System.out.println("  Accepted: " + a);
            } catch (IllegalArgumentException e) {
                System.out.println("  Rejected: " + e.getMessage());
            }
        }

        input.close();
    }
}
