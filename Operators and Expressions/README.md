# Java Operators and Expressions

Eight beginner tasks on Java operators: arithmetic, integer division and `%`, precedence, casting, compound assignment and the logical operators.

## Tasks

| File | Task | Covers | What it does |
|---|---|---|---|
| [Task1.java](Task1.java) | Matatu Fare Budget | * and + | Multiplies fare, trips and days into weekly and monthly totals |
| [Task2.java](Task2.java) | Sharing Mandazi | / and `%` | Integer division for each share, `%` for the remainder |
| [Task3.java](Task3.java) | Time Converter | / and `%` with units | Splits seconds into h, min and s with `/` and `%` |
| [Task4.java](Task4.java) | Cash Withdrawal Notes | repeated / and `%` | Breaks an amount into 1000, 500, 200, 100 and 50 notes |
| [Task5.java](Task5.java) | Average Mark | (double) cast | Shows int division beside a `(double)` cast and `Math.round` |
| [Task6.java](Task6.java) | Temperature Converter | precedence | Compares `9 / 5` with `9.0 / 5` in the conversion |
| [Task7.java](Task7.java) | M-Pesa Wallet | `+=`, -= and `++` | Updates a balance with `+=`, `-=` and counts with `++` |
| [Task8.java](Task8.java) | Loan Eligibility | `&&`, `||` and `!` | Combines three rules with `&&`, `||` and `!` |

## Sample output

**Task 4: Cash Withdrawal Notes**
```
Amount to withdraw (KES): 3780
1000 notes: 3
 500 notes: 1
 200 notes: 1
 100 notes: 0
  50 notes: 1
In coins:   KES 30
```

**Task 5: Average Mark**
```
Mark 1: 68
Mark 2: 72
Mark 3: 75
Total: 215
Average without a cast: 71
Average with a cast:    71.66666666666667
Rounded average:        72
```

## Run a task

```bash
javac Task1.java
java Task1
```
