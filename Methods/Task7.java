// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Methods Assignment
// Task 7: Pass by Value

import java.util.Arrays;

public class Task7 {

    // Gets a COPY of the number, so the caller's variable cannot change
    static void addBonus(int mark) {
        mark += 5;
        System.out.println("Inside addBonus: " + mark);
    }

    // Gets a copy of the array's address, so it can change what is inside
    static void addBonusToAll(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 5;
        }
    }

    // The proper way to change a number: return the new value
    static int withBonus(int mark) {
        return mark + 5;
    }

    public static void main(String[] args) {
        int mark = 60;
        addBonus(mark);
        System.out.println("After addBonus:  " + mark);

        mark = withBonus(mark);
        System.out.println("After withBonus: " + mark);

        int[] classMarks = {55, 62, 70};
        addBonusToAll(classMarks);
        System.out.println("Array after addBonusToAll: " + Arrays.toString(classMarks));
    }
}
