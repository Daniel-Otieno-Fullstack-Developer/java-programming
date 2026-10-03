// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - ArrayList and Collections Assignment
// Task 8: Course Registers

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task8 {
    public static void main(String[] args) {
        String[][] enrolments = {
            {"Amina", "Java"}, {"Brian", "Web Design"}, {"Chebet", "Java"},
            {"Dahir", "Networking"}, {"Esther", "Web Design"}, {"Faith", "Java"}
        };

        // Each course name maps to a whole list of students
        HashMap<String, ArrayList<String>> registers = new HashMap<>();
        for (String[] pair : enrolments) {
            String student = pair[0];
            String course = pair[1];
            if (!registers.containsKey(course)) {
                registers.put(course, new ArrayList<>());   // first student on this course
            }
            registers.get(course).add(student);
        }

        for (Map.Entry<String, ArrayList<String>> entry : new TreeMap<>(registers).entrySet()) {
            ArrayList<String> students = entry.getValue();
            System.out.println(entry.getKey() + " (" + students.size() + "): " + students);
        }

        String largest = "";
        for (String course : registers.keySet()) {
            if (largest.isEmpty() || registers.get(course).size() > registers.get(largest).size()) {
                largest = course;
            }
        }
        System.out.println("Largest class: " + largest);
    }
}
