// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Methods Assignment
// Task 6: Overloaded Totals

public class Task6 {

    // Three methods share one name; Java picks one by the arguments given
    static int total(int a, int b) {
        return a + b;
    }

    static int total(int a, int b, int c) {
        return a + b + c;
    }

    static double total(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Two fares:       " + total(50, 70));
        System.out.println("Three fares:     " + total(50, 70, 100));
        System.out.println("Two fuel prices: " + total(177.5, 180.25));
    }
}
