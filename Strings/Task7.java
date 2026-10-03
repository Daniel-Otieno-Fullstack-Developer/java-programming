// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Strings Assignment
// Task 7: Receipt Builder

public class Task7 {
    public static void main(String[] args) {
        String[] items = {"Exercise book", "Pen", "Maths set", "Ream of paper"};
        int[] quantities = {6, 10, 1, 1};
        double[] prices = {55.0, 20.0, 350.0, 680.0};

        // StringBuilder is built for adding to text again and again
        StringBuilder receipt = new StringBuilder();
        receipt.append("DELHI COLLEGE BOOKSHOP\n");
        receipt.append("-".repeat(40)).append("\n");

        double total = 0;
        for (int i = 0; i < items.length; i++) {
            double lineTotal = quantities[i] * prices[i];
            total += lineTotal;
            receipt.append(String.format("%-16s %3d x %6.2f %9.2f%n",
                    items[i], quantities[i], prices[i], lineTotal));
        }

        receipt.append("-".repeat(40)).append("\n");
        receipt.append(String.format("%-30s %9.2f", "TOTAL (KES)", total));

        System.out.println(receipt);
    }
}
