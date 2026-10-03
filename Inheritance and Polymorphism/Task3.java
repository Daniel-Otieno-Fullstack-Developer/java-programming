// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Inheritance and Polymorphism Assignment
// Task 3: Staff Pay

class Employee {
    protected final String name;
    protected final double basicPay;

    Employee(String name, double basicPay) {
        this.name = name;
        this.basicPay = basicPay;
    }

    double monthlyPay() {
        return basicPay;
    }

    void printPayslip() {
        System.out.printf("%-14s KES %,10.2f%n", name, monthlyPay());
    }
}

class Manager extends Employee {
    private final double allowance;

    Manager(String name, double basicPay, double allowance) {
        super(name, basicPay);
        this.allowance = allowance;
    }

    // Overriding: same name and parameters, new behaviour
    @Override
    double monthlyPay() {
        return super.monthlyPay() + allowance;   // reuse the parent's answer
    }
}

public class Task3 {
    public static void main(String[] args) {
        Employee clerk = new Employee("Joyce Achieng", 32000);
        Manager head = new Manager("Grace Njoroge", 85000, 15000);

        clerk.printPayslip();
        head.printPayslip();   // printPayslip calls the Manager's monthlyPay
    }
}
