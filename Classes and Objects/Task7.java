// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Classes and Objects Assignment
// Task 7: Product Shelf

class Product {
    private final String name;
    private final double price;
    private int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double stockValue() {
        return price * quantity;
    }

    int getQuantity() {
        return quantity;
    }

    String getName() {
        return name;
    }

    // toString decides what println shows for a Product
    @Override
    public String toString() {
        return String.format("%-14s KES %8.2f x %3d", name, price, quantity);
    }
}

public class Task7 {
    public static void main(String[] args) {
        Product[] shelf = {
            new Product("Sugar 2kg", 370.00, 24),
            new Product("Cooking oil", 545.50, 12),
            new Product("Unga 2kg", 199.00, 40),
            new Product("Tea leaves", 120.00, 0)
        };

        double total = 0;
        for (Product p : shelf) {
            System.out.println(p);
            total += p.stockValue();
        }
        System.out.printf("Stock value: KES %,.2f%n", total);

        for (Product p : shelf) {
            if (p.getQuantity() == 0) {
                System.out.println("Restock needed: " + p.getName());
            }
        }
    }
}
