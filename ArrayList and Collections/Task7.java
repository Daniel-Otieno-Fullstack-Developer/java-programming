// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - ArrayList and Collections Assignment
// Task 7: Class Ranking

import java.util.ArrayList;

class Pupil {
    private final String name;
    private final int mark;

    Pupil(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    String getName() {
        return name;
    }

    int getMark() {
        return mark;
    }
}

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Pupil> pupils = new ArrayList<>();
        pupils.add(new Pupil("Amina", 72));
        pupils.add(new Pupil("Brian", 58));
        pupils.add(new Pupil("Chebet", 91));
        pupils.add(new Pupil("Dahir", 39));
        pupils.add(new Pupil("Esther", 64));

        // The lambda says how to compare two pupils: higher mark first
        pupils.sort((a, b) -> Integer.compare(b.getMark(), a.getMark()));

        System.out.println("Rank  Name     Mark");
        for (int i = 0; i < pupils.size(); i++) {
            Pupil p = pupils.get(i);
            System.out.printf("%-5d %-8s %4d%n", i + 1, p.getName(), p.getMark());
        }

        ArrayList<String> passed = new ArrayList<>();
        for (Pupil p : pupils) {
            if (p.getMark() >= 40) {
                passed.add(p.getName());
            }
        }
        System.out.println("Passed (" + passed.size() + "): " + String.join(", ", passed));
    }
}
