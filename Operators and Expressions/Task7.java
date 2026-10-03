// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Operators and Expressions Assignment
// Task 7: M-Pesa Wallet

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        final int WITHDRAWAL_FEE = 29;
        Scanner input = new Scanner(System.in);
        int transactions = 0;

        System.out.print("Opening balance (KES): ");
        int balance = input.nextInt();

        System.out.print("Deposit (KES): ");
        int deposit = input.nextInt();
        balance += deposit;          // same as balance = balance + deposit
        transactions++;

        System.out.print("Withdrawal (KES): ");
        int withdrawal = input.nextInt();
        balance -= withdrawal;
        balance -= WITHDRAWAL_FEE;   // the agent charges a fee
        transactions++;

        System.out.print("Airtime (KES): ");
        int airtime = input.nextInt();
        balance -= airtime;
        transactions++;

        System.out.println("Transactions: " + transactions);
        System.out.println("Closing balance: KES " + balance);

        input.close();
    }
}
