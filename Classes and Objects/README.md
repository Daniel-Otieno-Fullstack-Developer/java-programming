# Java Classes and Objects

Eight intermediate tasks on designing Java classes: fields, constructors, `this`, getters and setters, encapsulation, `static` members and arrays of objects.

## Tasks

| File | Task | Covers | What it does |
|---|---|---|---|
| [Task1.java](Task1.java) | Student Record | fields and methods | A class with four fields and two methods, used twice |
| [Task2.java](Task2.java) | Plot Measurements | constructor | A constructor sets the fields; methods return area and fence |
| [Task3.java](Task3.java) | Matatu Fleet | overloaded constructors | Two constructors, one calling the other with `this(...)` |
| [Task4.java](Task4.java) | Mark Keeper | `private`, getters and setters | A private field guarded by a setter that rejects bad marks |
| [Task5.java](Task5.java) | Bank Account | encapsulation | Balance changes only through checked methods |
| [Task6.java](Task6.java) | Visitor Counter | `static` vs instance | A static counter shared by every object |
| [Task7.java](Task7.java) | Product Shelf | array of objects and `toString` | An array of objects printed through `toString` |
| [Task8.java](Task8.java) | Library Loans | objects that change state | An object whose methods depend on its current state |

## Sample output

**Task 5: Bank Account**
```
Halima Abdi opens with KES 5000.0
Deposit (KES): 1500
Balance: KES 6500.0
Withdraw (KES): 2000
Done. Balance: KES 4500.0
Withdraw (KES): 7000
Refused: that would overdraw the account
```

**Task 7: Product Shelf**
```
Sugar 2kg      KES   370.00 x  24
Cooking oil    KES   545.50 x  12
Unga 2kg       KES   199.00 x  40
Tea leaves     KES   120.00 x   0
Stock value: KES 23,386.00
Restock needed: Tea leaves
```

## Run a task

```bash
javac Task1.java
java Task1
```
