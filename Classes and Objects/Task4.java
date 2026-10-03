// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Classes and Objects Assignment
// Task 4: Mark Keeper

import java.util.Scanner;

class Learner {
    // private: only code inside Learner can touch these fields
    private String name;
    private int mark;

    Learner(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getMark() {
        return mark;
    }

    // The setter is the only way in, so it can refuse impossible marks
    boolean setMark(int mark) {
        if (mark < 0 || mark > 100) {
            return false;
        }
        this.mark = mark;
        return true;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Learner learner = new Learner("Chebet Rotich");

        boolean saved = false;
        while (!saved) {
            System.out.print("Mark for " + learner.getName() + ": ");
            saved = learner.setMark(input.nextInt());
            if (!saved) {
                System.out.println("  Rejected: a mark must be from 0 to 100");
            }
        }
        System.out.println("Saved mark: " + learner.getMark());

        input.close();
    }
}
