// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Inheritance and Polymorphism Assignment
// Task 6: Taxable Income

// An interface lists what a class promises to do, without saying how
interface Taxable {
    double RATE = 0.16;          // interface fields are constants

    double taxableAmount();

    default double tax() {       // a default method: shared code in the interface
        return taxableAmount() * RATE;
    }
}

class Salary implements Taxable {
    private final double gross;

    Salary(double gross) {
        this.gross = gross;
    }

    @Override
    public double taxableAmount() {
        return gross - 2400;     // a fixed relief is taken off first
    }
}

class Rental implements Taxable {
    private final double monthlyRent;
    private final int months;

    Rental(double monthlyRent, int months) {
        this.monthlyRent = monthlyRent;
        this.months = months;
    }

    @Override
    public double taxableAmount() {
        return monthlyRent * months;
    }
}

public class Task6 {
    public static void main(String[] args) {
        Taxable[] incomes = {new Salary(60000), new Rental(25000, 3)};
        String[] labels = {"Salary", "Rental"};

        double totalTax = 0;
        for (int i = 0; i < incomes.length; i++) {
            System.out.printf("%-7s taxable %,10.2f  tax %,9.2f%n",
                    labels[i], incomes[i].taxableAmount(), incomes[i].tax());
            totalTax += incomes[i].tax();
        }
        System.out.printf("Total tax: KES %,.2f%n", totalTax);
    }
}
