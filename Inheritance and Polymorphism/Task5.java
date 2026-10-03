// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Inheritance and Polymorphism Assignment
// Task 5: Payment Methods

import java.util.Scanner;

abstract class Payment {
    protected final double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract double fee();

    abstract String method();

    double total() {
        return amount + fee();
    }
}

class MpesaPayment extends Payment {
    MpesaPayment(double amount) {
        super(amount);
    }

    @Override
    double fee() {
        return amount <= 1000 ? 13 : 23;
    }

    @Override
    String method() {
        return "M-Pesa";
    }
}

class CardPayment extends Payment {
    CardPayment(double amount) {
        super(amount);
    }

    @Override
    double fee() {
        return amount * 0.02;      // 2% card charge
    }

    @Override
    String method() {
        return "Card";
    }
}

class CashPayment extends Payment {
    CashPayment(double amount) {
        super(amount);
    }

    @Override
    double fee() {
        return 0;
    }

    @Override
    String method() {
        return "Cash";
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount to pay (KES): ");
        double amount = input.nextDouble();

        Payment[] options = {new MpesaPayment(amount), new CardPayment(amount),
                             new CashPayment(amount)};

        // The same call, p.fee(), runs a different method for each kind of payment
        for (Payment p : options) {
            System.out.printf("%-7s fee %6.2f  total %9.2f%n", p.method(), p.fee(), p.total());
        }

        input.close();
    }
}
