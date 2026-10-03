// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Data Types and Variables Assignment
// Task 8: Type Ranges Table

public class Task8 {
    public static void main(String[] args) {
        // %-8s pads a word to 8 places, %-6d pads a number to 6, so the columns line up
        System.out.printf("%-8s %-6s %s%n", "Type", "Bytes", "Largest value");
        System.out.printf("%-8s %-6d %d%n", "byte", Byte.BYTES, Byte.MAX_VALUE);
        System.out.printf("%-8s %-6d %d%n", "short", Short.BYTES, Short.MAX_VALUE);
        System.out.printf("%-8s %-6d %d%n", "int", Integer.BYTES, Integer.MAX_VALUE);
        System.out.printf("%-8s %-6d %d%n", "long", Long.BYTES, Long.MAX_VALUE);
        System.out.printf("%-8s %-6d %s%n", "float", Float.BYTES, Float.MAX_VALUE);
        System.out.printf("%-8s %-6d %s%n", "double", Double.BYTES, Double.MAX_VALUE);
        System.out.printf("%-8s %-6d %d%n", "char", Character.BYTES, (int) Character.MAX_VALUE);
        System.out.printf("%-8s %-6s %s%n", "boolean", "-", "true");
        // long holds the largest whole numbers; double holds the largest values of all
    }
}
