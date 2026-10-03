# Java Decisions

Eight beginner tasks on making decisions in Java: `if`, `else`, `else if` chains, nested decisions, `switch` statements and switch expressions.

## Tasks

| File | Task | Covers | What it does |
|---|---|---|---|
| [Task1.java](Task1.java) | Fees Reminder | `if` | Prints a reminder only when a balance is owed |
| [Task2.java](Task2.java) | Even or Odd | `if` ... `else` | Uses `%` and `if`/`else` to classify a number |
| [Task3.java](Task3.java) | Grade Calculator | `else` `if` chain | Grades a mark A to E and rejects impossible marks |
| [Task4.java](Task4.java) | Matatu Peak Fare | `&&` and `||` | Works out the fare from the hour with `&&` and `||` |
| [Task5.java](Task5.java) | ATM Withdrawal | nested `if` | Nested decisions: PIN first, then the amount |
| [Task6.java](Task6.java) | Day of the Week | `switch` and `break` | Day names with `case`/`break`, weekend by fall-through |
| [Task7.java](Task7.java) | Grade Comments | `switch` expression | Two switch expressions return a comment and a pass flag |
| [Task8.java](Task8.java) | Mobile Money Menu | `switch` with blocks | A menu `switch` with an `if` check inside one case |

## Sample output

**Task 3: Grade Calculator**
```
Enter the mark (0-100): 64
Grade: B
```

**Task 8: Mobile Money Menu**
```
=== DELHI PESA ===
1. Check balance
2. Send money
3. Buy KES 100 airtime
Choose an option: 2
Amount to send (KES): 1500
Sent KES 1500. New balance: KES 3500
```

## Run a task

```bash
javac Task1.java
java Task1
```
