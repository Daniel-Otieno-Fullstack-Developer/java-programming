// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - ArrayList and Collections Assignment
// Task 3: Remove the Absentees

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> register = new ArrayList<>(List.of(
                "Amina", "Brian", "Chebet", "Dahir", "Esther", "Faith"));
        List<String> absent = List.of("Brian", "Esther");
        System.out.println("Register: " + register);

        // An Iterator can remove items safely while looping
        Iterator<String> it = register.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (absent.contains(name)) {
                it.remove();
                System.out.println("  Removed " + name);
            }
        }
        System.out.println("Present: " + register);

        // removeIf does the same job in one line
        register.removeIf(name -> name.startsWith("D"));
        System.out.println("Without names starting with D: " + register);
    }
}
