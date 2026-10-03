// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - ArrayList and Collections Assignment
// Task 4: Bursar's Queue

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> queue = new ArrayList<>();

        queue.add("Amina");
        queue.add("Brian");
        queue.add("Chebet");
        queue.add("Dahir");
        System.out.println("Queue: " + queue);

        String served = queue.remove(0);       // the person at the front leaves
        System.out.println("Served: " + served);

        queue.add(1, "Esther");                 // a student with a letter is let in second
        System.out.println("Esther joins second: " + queue);

        int pos = queue.indexOf("Dahir");
        System.out.println("Dahir is at position " + (pos + 1));

        queue.set(pos, "Dahir (paid online)");  // replace an item
        System.out.println("Queue now: " + queue);
        System.out.println("Is Faith waiting? " + queue.contains("Faith"));

        while (!queue.isEmpty()) {
            System.out.println("Serving " + queue.remove(0) + ", " + queue.size() + " left");
        }
    }
}
