# Java Inheritance and Polymorphism

Eight intermediate tasks on inheritance in Java: `extends` and `super`, overriding, abstract classes, polymorphism, interfaces, `Comparable` and `instanceof`.

## Tasks

| File | Task | Covers | What it does |
|---|---|---|---|
| [Task1.java](Task1.java) | People at College | `extends` | A subclass inherits fields and a method from its parent |
| [Task2.java](Task2.java) | Vehicles and Buses | super(...) | Shows the parent constructor running before the child's |
| [Task3.java](Task3.java) | Staff Pay | overriding | An overridden method that reuses `super` |
| [Task4.java](Task4.java) | Shapes | `abstract` `class` | Three subclasses fill in one abstract method |
| [Task5.java](Task5.java) | Payment Methods | polymorphism | One loop calls a different `fee()` for each payment type |
| [Task6.java](Task6.java) | Taxable Income | `interface` | Two unrelated classes implement one interface |
| [Task7.java](Task7.java) | Ranked Candidates | `Comparable` | `compareTo` lets `Arrays.sort` order objects |
| [Task8.java](Task8.java) | Staff Roles | `instanceof` | Pattern-matching `instanceof` reaches a subclass method |

## Sample output

**Task 3: Staff Pay**
```
Joyce Achieng  KES  32,000.00
Grace Njoroge  KES 100,000.00
```

**Task 5: Payment Methods**
```
Amount to pay (KES): 2500
M-Pesa  fee  23.00  total   2523.00
Card    fee  50.00  total   2550.00
Cash    fee   0.00  total   2500.00
```

## Run a task

```bash
javac Task1.java
java Task1
```
