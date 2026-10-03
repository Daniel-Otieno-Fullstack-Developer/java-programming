# Java Exceptions

Eight intermediate tasks on handling errors in Java: `try`, `catch` and `finally`, several catch blocks, `throw` and `throws`, checked exceptions and custom exception classes.

## Tasks

| File | Task | Covers | What it does |
|---|---|---|---|
| [Task1.java](Task1.java) | Safe Number Input | `try` and `catch` | Catches `InputMismatchException` and asks again |
| [Task2.java](Task2.java) | Fare Splitter | ArithmeticException | Catches division by zero and carries on |
| [Task3.java](Task3.java) | Class List Lookup | several `catch` blocks | Two catch blocks for two different errors |
| [Task4.java](Task4.java) | Exam Session | `finally` | A `finally` block that runs in both cases |
| [Task5.java](Task5.java) | Applicant Checks | `throw` | A constructor that throws on bad data |
| [Task6.java](Task6.java) | Save and Load Marks | checked exceptions | `throws`, try-with-resources and a caught checked exception |
| [Task7.java](Task7.java) | Wallet with a Custom Exception | custom checked exception | A custom checked exception with its own data |
| [Task8.java](Task8.java) | Mark Sheet Cleaner | custom unchecked exception | A custom unchecked exception and a multi-catch |

## Sample output

**Task 3: Class List Lookup**
```
Position on the list (1-5): 3
  Student 3 is Chebet
Position on the list (1-5): four
  "four" is not a number
Position on the list (1-5): 9
  There is no student at position 9
```

**Task 8: Mark Sheet Cleaner**
```
Skipped "abc": For input string: "abc"
Skipped "105": mark 105 is outside 0 to 100
Skipped "": For input string: ""
Skipped "-3": mark -3 is outside 0 to 100
4 good marks, 4 skipped
Average of good marks: 68.75
```

## Run a task

```bash
javac Task1.java
java Task1
```
