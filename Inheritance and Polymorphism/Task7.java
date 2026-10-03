// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Inheritance and Polymorphism Assignment
// Task 7: Ranked Candidates

import java.util.Arrays;

class Candidate implements Comparable<Candidate> {
    private final String name;
    private final int mark;

    Candidate(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    // Negative: this comes first. Higher marks should come first.
    @Override
    public int compareTo(Candidate other) {
        return Integer.compare(other.mark, this.mark);
    }

    @Override
    public String toString() {
        return name + " (" + mark + ")";
    }
}

public class Task7 {
    public static void main(String[] args) {
        Candidate[] list = {
            new Candidate("Brian", 64), new Candidate("Amina", 81),
            new Candidate("Dahir", 47), new Candidate("Chebet", 73)
        };

        Arrays.sort(list);   // works because Candidate is Comparable
        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) + ". " + list[i]);
        }
    }
}
