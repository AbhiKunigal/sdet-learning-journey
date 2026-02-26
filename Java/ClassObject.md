# Classes and Objects — Java OOP Concepts (SDET-QA Session 10)

## OOP Concepts Overview
Java supports six main object-oriented programming concepts:
1. **Class** — blueprint for objects
2. **Object** — instance of a class
3. **Polymorphism** — multiple forms of behavior
4. **Encapsulation** — data hiding and controlled access
5. **Inheritance** — code reuse through parent-child relationships
6. **Data Abstraction** — hiding implementation details

Java is considered a **purely object-oriented language** because it supports all six concepts.

---

## What is a Class?

### Definition
- A **class** is a **collection of attributes (variables) and behavior (methods)**.
- A class is a **logical entity** — it exists as a blueprint, not a physical entity.
- A class is a **virtual entity** — it has no physical existence and occupies no memory.
- A class is like a **blueprint or plan** — just as a blueprint defines how to build a house, a class defines how to create objects.

### Key Points About Classes
- **Not Physical**: Class is not a tangible entity; it's just a name given to a group of elements with similar attributes and behavior.
- **Logical Entity**: The class exists in design and code, not in memory at runtime.
- **No Memory Space**: Because it is logical/virtual, a class does **NOT occupy any space in memory**.
- **Multiple Objects**: One class can serve as a template to create **multiple objects**.

### Real-World Examples
- **Animal (class)**: Category grouping dog, elephant, horse (objects). Similar attributes (color, height), similar behavior (eating, running, sleeping).
- **Student (class)**: Category for Kim, David, Scott (objects). Each has ID, name, grade.
- **Employee (class)**: Category for John, Smith, Mary (objects). Each has employee ID, name, salary.

### Class Syntax in Java
```java
class ClassName {
    // Variables (attributes)
    int variableName;
    String anotherVariable;
    
    // Methods (behavior)
    void methodName() {
        // method implementation
    }
}
```

---

## What is an Object?

### Definition
- An **object** is an **instance of a class**.
- An **object** is created **from a class**.
- Objects are **physical entities** — they have physical existence in memory.
- Objects are **derived from the class** — without a class, there is no object.

### Key Points About Objects
- **Physical Entity**: Unlike a class, an object is tangible and **occupies space in memory**.
- **Instance-Specific**: Each object has its own copy of variables and methods.
- **Independent**: Multiple objects from the same class are **independent** and have **no connection** to each other, even though they come from the same class.
- **Different Data**: The variables are the same for all objects, but the **values can be different** for each object.
  - Example: All `Employee` objects have `employeeID`, but emp1 might have ID=101, emp2 might have ID=102.

### Object Creation Syntax
```java
ClassName objectName = new ClassName();
```

**Example:**
```java
Employee emp1 = new Employee();
Employee emp2 = new Employee();
Employee emp3 = new Employee();
```

Each `emp1`, `emp2`, `emp3` are separate objects with their own copy of variables and methods, stored in different memory locations.

---

## Class vs Object (Comparison)

| Aspect | Class | Object |
|--------|-------|--------|
| **Definition** | Collection of attributes and behavior | Instance of a class |
| **Entity Type** | Logical entity | Physical entity |
| **Memory** | Does NOT occupy memory | Occupies memory space |
| **Existence** | Virtual/Blueprint | Real/Physical |
| **Creation** | Declared once | Can create multiple instances |
| **Access** | Not directly used; accessed via objects | Directly used and operated |

---


## Methods (from SDET-QA Video)

### What is a Method?
- A **method** is a block of code that performs a specific task or action.
- Methods are **defined inside a class** and can only be executed when called (invoked).
- Methods are part of the **behavior** of a class.
- Syntax: `[accessModifier] [returnType] methodName([parameters]) { /* method body */ }`

### Method Characteristics (Key Points)
1. Methods in a class contain the **implementation** (what the method does).
2. Methods are **invoked/called** to perform their task.
3. A method is a **user-defined method** (we create our own methods) or **pre-defined methods** (already created, like string methods).
4. Methods have a **return type** that indicates what they return.

### Accessing Variables and Methods from Objects
- You **cannot directly work with the class variables and methods**.
- You can **only access them through objects** using the **dot operator** (`.`).

**Syntax:**
```java
objectName.variableName;      // Access variable
objectName.methodName();        // Call method
```

**Example:**
```java
Employee emp1 = new Employee();
emp1.empID;          // Access variable from emp1 object
emp1.empName;        // Access variable from emp1 object
emp1.display();      // Call display method from emp1 object

Employee emp2 = new Employee();
emp2.empID;          // Different object, different memory space
emp2.display();      // Call method on emp2 object
```

Even though `emp1` and `emp2` are created from the same `Employee` class, they are **independent** and stored in **different memory locations**.

---

## How Objects Work (Object Acquisition of Class Members)

### Object Creation Process
When you create an object from a class:
1. The object acquires its **own copy of all variables** from the class.
2. The object acquires its **own copy of all methods** from the class.
3. Each object stores its **own data values** in **separate memory locations**.
4. Each object **contains the same structure** but can have **different data**.

### Example
**Class Definition:**
```java
class Employee {
    int empID;
    String empName;
    double salary;
    
    void display() {
        System.out.println(empID + " " + empName + " " + salary);
    }
}
```

**Creating Multiple Objects:**
```java
Employee emp1 = new Employee();  // emp1 has: empID, empName, salary, display()
Employee emp2 = new Employee();  // emp2 has: empID, empName, salary, display()
Employee emp3 = new Employee();  // emp3 has: empID, empName, salary, display()

// Setting different values
emp1.empID = 101;    emp1.empName = "John";    emp1.salary = 50000;
emp2.empID = 102;    emp2.empName = "Smith";   emp2.salary = 60000;
emp3.empID = 103;    emp3.empName = "Mary";    emp3.salary = 55000;

// Calling methods
emp1.display();  // Output: 101 John 50000
emp2.display();  // Output: 102 Smith 60000
emp3.display();  // Output: 103 Mary 55000
```

### Key Takeaways
- **Same Class, Different Objects**: Even though all three objects come from the same `Employee` class, they are **independent**.
- **Different Memory Locations**: `emp1`, `emp2`, and `emp3` are stored in **different memory locations**.
- **No Connection Between Objects**: There is **no relationship** between `emp1`, `emp2`, and `emp3`; they are completely independent.
- **Own Copy of Variables**: Each object has its own copy of `empID`, `empName`, `salary` variables.
- **Own Copy of Methods**: Each object has its own copy of the `display()` method.

---

## Why Data is NOT Assigned in the Class

**Wrong Approach:**
```java
class Employee {
    int empID = 101;  // WRONG: If you assign here
    String empName = "John";
}
```

**Problem**: When you create objects, **all objects will have the same values** (101, John), making each object identical and pointless.

**Correct Approach:**
```java
class Employee {
    int empID;        // Just declare, no value
    String empName;   // Just declare, no value
}

// Create objects and set DIFFERENT values
Employee emp1 = new Employee();
emp1.empID = 101;
emp1.empName = "John";

Employee emp2 = new Employee();
emp2.empID = 102;
emp2.empName = "Smith";
```

Now each object can have **different data**.

---

## Object Lifecycle & Memory

### Lifecycle Stages
1. **Declaration**: `Employee emp;` — Reference created, points to nothing (null).
2. **Instantiation**: `emp = new Employee();` — Object created on heap, reference assigned.
3. **Usage**: `emp.display();` — Call methods, access/modify variables.
4. **Garbage Collection**: When no references exist, object is reclaimed by garbage collector.

### Memory Allocation
- **Class**: Defined in code; does NOT occupy runtime memory.
- **Object**: Occupies memory on the **heap** when created with `new`.
- **Reference Variable**: Typically stored on the **stack**, holds the memory address (reference) to the object.

---

## Practical Example (from Video)

```java
public class Employee {
    // Variables (attributes) - No data assigned here
    int empID;
    String empName;
    String job;
    double salary;
    
    // User-defined method
    void display() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + salary);
    }
    
    // Main method to create objects and test
    public static void main(String[] args) {
        // Create first object
        Employee emp1 = new Employee();
        emp1.empID = 101;
        emp1.empName = "John";
        emp1.job = "Developer";
        emp1.salary = 50000;
        emp1.display();
        
        // Create second object
        Employee emp2 = new Employee();
        emp2.empID = 102;
        emp2.empName = "Smith";
        emp2.job = "Manager";
        emp2.salary = 60000;
        emp2.display();
        
        // Create third object
        Employee emp3 = new Employee();
        emp3.empID = 103;
        emp3.empName = "Mary";
        emp3.job = "Analyst";
        emp3.salary = 55000;
        emp3.display();
    }
}
```

**Output:**
```
Employee ID: 101
Employee Name: John
Job: Developer
Salary: 50000
Employee ID: 102
Employee Name: Smith
Job: Manager
Salary: 60000
Employee ID: 103
Employee Name: Mary
Job: Analyst
Salary: 55000
```

---

## Quick Reference

### Creating a Class
```java
class ClassName {
    // Variables
    type variableName;
    
    // Methods
    returnType methodName(parameters) {
        // implementation
    }
}
```

### Creating Objects
```java
ClassName obj1 = new ClassName();
ClassName obj2 = new ClassName();
```

### Accessing Variables and Methods
```java
obj1.variableName;      // Access variable
obj1.methodName();       // Call method
obj2.variableName = value;  // Set variable value
```

### Static Access (Class-level)
```java
ClassName.staticVariable;
ClassName.staticMethod();
```

---

## Important Points to Remember (From Video)

1. **Class is a logical entity**: Not physical, no memory occupation, just a blueprint.
2. **Object is a physical entity**: Occupies memory, real instance of a class.
3. **One class, multiple objects**: From one class, you can create multiple independent objects.
4. **Objects are independent**: Even though derived from the same class, objects have no connection to each other.
5. **Data differs per object**: Each object can have different values for the same variables.
6. **Access through objects**: You cannot directly use class variables/methods; you must access through objects using the dot operator.
7. **Separate memory locations**: Each object stores in a different memory location on the heap.
8. **Don't assign data in class**: Keep variables uninitialized in the class; assign values through objects to ensure variety.

---

## Summary

**Class**: Logical, virtual blueprint → no memory, defines structure
**Object**: Physical instance → occupies memory, contains actual data
**Relationship**: Objects are derived from classes; one class can have multiple independent objects
**Access**: Only through object references using the dot operator
**Methods**: Behavior of objects; invoked to perform tasks
**Variables**: Attributes of objects; each object has its own copy with potentially different values

---

## File Purpose
This file documents **Class and Object fundamentals from SDET-QA Java OOP Concepts (Session 10)**, focusing on understanding the core building blocks of object-oriented programming in Java.
