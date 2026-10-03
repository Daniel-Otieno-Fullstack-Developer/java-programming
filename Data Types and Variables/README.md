# Java Data Types and Variables

Eight beginner tasks on choosing and using Java's data types: `int`, `long`, `double`, `char`, `boolean` and `String`, plus `var`, `final` constants and `Scanner` input.

## Tasks

| File | Task | Covers | What it does |
|---|---|---|---|
| [Task1.java](Task1.java) | Student ID Card | `String`, `int` and `char` | Prints a student card from five typed variables |
| [Task2.java](Task2.java) | Age Calculator | `int` and `Scanner` | Reads a birth year and prints the age |
| [Task3.java](Task3.java) | Duka Receipt | `double` and `var` | Uses `var` to total a price per kg times weight |
| [Task4.java](Task4.java) | VAT Calculator | `final` constants | Adds 16% VAT using a `final` rate |
| [Task5.java](Task5.java) | Pass or Fail | `boolean` | Stores pass and distinction results as booleans |
| [Task6.java](Task6.java) | Seconds Alive | `int` overflow and `long` | Shows `int` overflow next to the correct `long` answer |
| [Task7.java](Task7.java) | About Me | `String` and `nextLine` | Reads three lines of text and counts the name's characters |
| [Task8.java](Task8.java) | Type Ranges Table | primitive sizes and limits | Prints a table of type sizes and largest values |

## Sample output

**Task 3: Duka Receipt**
```
Item name: Sugar
Price per kg (KES): 185.50
Kilograms bought: 2.5

Item:   Sugar
Price:  KES 185.5 per kg
Weight: 2.5 kg
Total:  KES 463.75
```

**Task 6: Seconds Alive**
```
Enter an age in years: 80
Using int:  -1772087296
Using long: 2522880000
```

## Run a task

```bash
javac Task1.java
java Task1
```
