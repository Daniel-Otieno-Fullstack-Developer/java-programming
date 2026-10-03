// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - ArrayList and Collections Assignment
// Task 6: Word Frequency

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String[] words = input.nextLine().toLowerCase().split(" +");

        HashMap<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            // getOrDefault gives 0 the first time a word is seen
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        // A TreeMap keeps its keys in alphabetical order, which is nicer to print
        TreeMap<String, Integer> sorted = new TreeMap<>(counts);
        String mostCommon = "";
        int best = 0;
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            if (entry.getValue() > best) {
                best = entry.getValue();
                mostCommon = entry.getKey();
            }
        }

        System.out.println(words.length + " words, " + counts.size() + " different");
        System.out.println("Most common: \"" + mostCommon + "\" (" + best + " times)");
        input.close();
    }
}
