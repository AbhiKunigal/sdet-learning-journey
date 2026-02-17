# Control Statements in Java

Control statements are programming constructs that control the flow of execution in a program.

## 1. Conditional Statements

These execute code based on a condition:

### if statement
Executes a block if condition is true
```java
if (age >= 18) {
    System.out.println("Adult");
}
```

### if-else statement
Executes one block if true, another if false
```java
if (grade >= 60) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### if-else if-else statement
Checks multiple conditions
```java
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 80) {
    System.out.println("Grade B");
} else if (marks >= 70) {
    System.out.println("Grade C");
} else {
    System.out.println("Grade F");
}
```

### Nested if-else Conditions
if-else blocks placed inside another if or else block.
```java
if (age >= 18) {
    if (income >= 50000) {
        System.out.println("Qualified for loan");
    }
}
```

### switch statement
Selects one of many code blocks to execute
```java
switch (day) {
    case 1: 
        System.out.println("Monday"); 
        break;
    case 2: 
        System.out.println("Tuesday"); 
        break;
    case 3: 
        System.out.println("Wednesday"); 
        break;
    default: 
        System.out.println("Other day");
}
```

### Ternary Operator
Short form of if-else
```java
int age = 20;
String status = (age >= 18) ? "Adult" : "Minor";
---

## 2. Iteration Statements (Loops)

These repeat code blocks multiple times:

### for loop
Repeats a block a specified number of times
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);  // Output: 0 1 2 3 4
}
```

### Enhanced for loop (for-each)
Iterates through arrays or collections
```java
int[] numbers = {10, 20, 30, 40};
for (int num : numbers) {
    System.out.println(num);
}
```

### while loop
Repeats while a condition is true
```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

### do-while loop
Executes at least once, then repeats while condition is true
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 10);
```

---

## 3. Jump Statements

These change the control flow:

### break statement
Exits a loop or switch block
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // Exits the loop
    }
    System.out.println(i);
}
```

### continue statement
Skips the current iteration and continues with the next
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue;  // Skips i=5
    }
    System.out.println(i);
}
```

### return statement
Exits a method and returns a value
```java
public int add(int a, int b) {
    return a + b;  // Exits method and returns the sum
}
```

---

## Summary

| Statement Type | Purpose |
|---|---|
| **if/else/switch** | Make decisions based on conditions |
| **for/while/do-while** | Repeat code blocks |
| **break/continue/return** | Control loop and method flow |

Control statements are fundamental to writing dynamic and efficient Java programs that can respond to different situations and automate repetitive tasks.
