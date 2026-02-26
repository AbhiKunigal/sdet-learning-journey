# Polymorphism and Encapsulation in Java

## Table of Contents
1. [Polymorphism](#polymorphism)
2. [Method Overloading](#method-overloading)
3. [Constructor Overloading](#constructor-overloading)
4. [Overloading Rules](#overloading-rules)
5. [Encapsulation](#encapsulation)
6. [Implementing Encapsulation](#implementing-encapsulation)
7. [Key Concepts and Comparison](#key-concepts-and-comparison)

---

## Polymorphism

### What is Polymorphism?

**Polymorphism** comes from two Greek words:
- **Poly** = Many
- **Morphism** = Forms

**Simple Definition**: Polymorphism means "one thing can have many forms"

**Definition for Interview:**
"Polymorphism is the ability of an object to take on multiple forms. In Java, it is achieved through method overloading (compile-time polymorphism) and method overriding (runtime polymorphism). It allows the same method name to behave differently based on the context or parameters, making code more flexible and reusable."

### Types of Polymorphism in Java

Java supports two types of polymorphism:

| Type | Method | Execution Time |
|------|--------|-----------------|
| **Compile-time (Static) Polymorphism** | Method Overloading & Constructor Overloading | Resolved at compile time |
| **Runtime (Dynamic) Polymorphism** | Method Overriding & Inheritance | Resolved at runtime |

**Focus of this document:** Compile-time Polymorphism (Overloading)

### Real-World Examples

1. **Shape Example**
   - One concept: "Shape"
   - Many forms: Circle, Square, Triangle, Rectangle

2. **Water Example**
   - One substance: "Water"
   - Many forms: Solid (Ice), Liquid (Water), Gas (Vapor)

### Polymorphism vs Overloading

- **Polymorphism** = Theoretical concept (theory)
- **Overloading** = Practical implementation in Java (how we achieve polymorphism)

### Why Polymorphism?

Provides a convenient way to use methods and constructors with the same name but different behaviors, making code more intuitive and user-friendly.

---

## Rules of Polymorphism

### Fundamental Rules to Follow

When implementing polymorphism in Java using overloading, follow these essential rules:

#### Rule 1: One Thing, Many Forms
- One method/constructor can exist in multiple forms
- Same name but different parameter combinations
- Each form handles different scenarios

#### Rule 2: Method/Constructor Name Must Remain the Same
```java
public void add() { }          // Form 1
public void add(int x) { }     // Form 2
public void add(int x, int y) { }  // Form 3
// All have the same name: add
```

#### Rule 3: Differentiate by Parameters (At Least One Must Change)
Methods must differ in at least one of the following:
- **Number of parameters**
- **Data type of parameters**
- **Order of parameters**

```java
// Different number of parameters
add()
add(5)
add(5, 10)

// Different data type
add(int x, int y)
add(double x, double y)
add(int x, double y)

// Different order of parameters
add(int x, double y)
add(double x, int y)
```

#### Rule 4: Return Type is NOT Considered
```java
// These are NOT overloading - DUPLICATE methods
public void add(int x) { }
public int add(int x) { }   // ✗ Different return type only - NOT valid!
```

#### Rule 5: Applicable to Both Methods and Constructors
```java
// Method overloading
public void display() { }
public void display(String msg) { }

// Constructor overloading
public MyClass() { }           // Default constructor
public MyClass(int id) { }     // Parameterized constructor
```

#### Rule 6: Parameter Names Don't Matter
```java
// These are DUPLICATE - parameter names don't differentiate
public void add(int x, int y) { }
public void add(int a, int b) { }  // ✗ Duplicate! Same parameters
```

---

## Method Overloading

### What is Method Overloading?

**Method Overloading** allows you to create multiple methods with the **same name** but **different parameters** within the same class.

### Benefits of Method Overloading

#### Scenario Comparison

**Without Overloading:**
```
add2Numbers()      // Add two numbers
add3Numbers()      // Add three numbers
add4Numbers()      // Add four numbers
```
- User must remember 3 different method names
- More method names to memorize
- Less intuitive

**With Overloading:**
```
add()  // Can add 2, 3, or 4 numbers
add()  // Same method name, different parameters
add()  // Similar interface for user
```
- User remembers only 1 method name
- More intuitive interface
- Same implementation complexity

### How Method Overloading Works

When you call an overloaded method, Java determines which version to execute based on:
1. **Number of parameters**
2. **Data type of parameters**
3. **Order of parameters**

---

## Overloading Rules

### Four Rules for Method Overloading

When overloading methods, follow these rules (in order of priority):

#### Rule 1: Method Name Must Be Same
```java
public void add() { }
public void add(int x) { }
public void add(int x, int y) { }
```
All methods have the same name: `add`

#### Rule 2: Number of Parameters Should Be Different
```java
public void sum() {
    // No parameters
}

public void sum(int x, int y) {
    // Two parameters
}

public void sum(int x, int y, int z) {
    // Three parameters
}
```

#### Rule 3: Data Type of Parameters Should Be Different
Use this rule when number of parameters is same but types are different:

```java
public void sum(int x, int y) {
    // Both integers
}

public void sum(int x, double y) {
    // One integer, one double
}

public void sum(double x, double y) {
    // Both doubles
}
```

#### Rule 4: Order of Parameters Should Be Different
Use this rule when number and type of parameters are same but order differs:

```java
public void sum(int x, double y) {
    // First int, then double
}

public void sum(double x, int y) {
    // First double, then int
}
```

### Important Note: Return Type is NOT Considered

```java
// These are DUPLICATES - NOT overloading
public void sum(int x) { }
public int sum(int x) { }  // Different return type doesn't matter!

// Error: Duplicate method sum(int) in type Calculator
```

---

## Practical Example: Method Overloading

### Implementation

```java
public class Adder {
    private int a = 10;
    private int b = 20;
    
    // Method 1: No parameters
    public void sum() {
        System.out.println(a + b);  // 30
    }
    
    // Method 2: Two integer parameters
    public void sum(int x, int y) {
        System.out.println(x + y);
    }
    
    // Method 3: One int and one double
    public void sum(int x, double y) {
        System.out.println(x + y);
    }
    
    // Method 4: One double and one int
    public void sum(double x, int y) {
        System.out.println(x + y);
    }
    
    // Method 5: Three integer parameters
    public void sum(int x, int y, int z) {
        System.out.println(x + y + z);
    }
}
```

### Usage

```java
public class AdderMain {
    public static void main(String[] args) {
        Adder obj = new Adder();
        
        // Calls Method 1 - no parameters
        obj.sum();  // Output: 30
        
        // Calls Method 2 - two integers
        obj.sum(100, 200);  // Output: 300
        
        // Calls Method 3 - int and double
        obj.sum(10, 15.5);  // Output: 25.5
        
        // Calls Method 4 - double and int
        obj.sum(10.5, 20);  // Output: 30.5
        
        // Calls Method 5 - three integers
        obj.sum(10, 20, 30);  // Output: 60
    }
}
```

### How Java Resolves Which Method to Call

1. **Check number of parameters** - matches number
2. **Check data type of parameters** - matches data types
3. **Check order of parameters** - matches order
4. **Call the matching method**

---

## Constructor Overloading

### What is Constructor Overloading?

Creating multiple constructors with the **same name** (class name) but **different parameters**.

### Why Constructor Overloading?

Allows different ways to initialize objects with different data.

### Example: Box Class with Constructor Overloading

```java
public class Box {
    private double width;
    private double height;
    private double depth;
    
    // Constructor 1: Default Constructor (no parameters)
    public Box() {
        width = 0;
        height = 0;
        depth = 0;
    }
    
    // Constructor 2: Parameterized Constructor (three parameters)
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    // Constructor 3: Single parameter Constructor
    public Box(double length) {
        width = length;
        height = length;
        depth = length;
    }
    
    // User-defined method to calculate volume
    public double volume() {
        return width * height * depth;
    }
}
```

### Usage

```java
public class BoxMain {
    public static void main(String[] args) {
        // Calls default constructor
        Box b1 = new Box();
        System.out.println(b1.volume());  // Output: 0.0
        
        // Calls parameterized constructor with three parameters
        Box b2 = new Box(10.5, 15.5, 5.0);
        System.out.println(b2.volume());  // Output: 812.125
        
        // Calls parameterized constructor with one parameter
        Box b3 = new Box(10.5);
        System.out.println(b3.volume());  // Output: 1157.625 (10.5^3)
    }
}
```

### Constructor Overloading Rules

Same rules apply as method overloading:
1. **Constructor name must be same** (class name)
2. **Number of parameters should be different**
3. **Data type of parameters should be different** (if number is same)
4. **Order of parameters should be different** (if type is same)

---

## Special Topic: Overloading the main() Method

### Can main() Be Overloaded?

**Yes**, the main method can also be overloaded!

### Example

```java
public class OverloadingMain {
    
    // Original main method (JVM entry point)
    public static void main(String[] args) {
        System.out.println("Main method with String array");
        
        // Call overloaded main methods through object
        OverloadingMain obj = new OverloadingMain();
        obj.main(100);
        obj.main("Hello");
        obj.main("Hello", "World");
    }
    
    // Overloaded main with integer parameter
    public void main(int x) {
        System.out.println("Main method with int: " + x);
    }
    
    // Overloaded main with String parameter
    public void main(String s) {
        System.out.println("Main method with String: " + s);
    }
    
    // Overloaded main with two String parameters
    public void main(String s1, String s2) {
        System.out.println("Main method with two Strings: " + s1 + ", " + s2);
    }
}
```

### Output
```
Main method with String array
Main method with int: 100
Main method with String: Hello
Main method with two Strings: Hello, World
```

### Important Note
- Only the `public static void main(String[] args)` method is executed by JVM
- Overloaded main methods must be called explicitly from within the program
- Command-line arguments are passed as a String array to the original main method

---

## Encapsulation

### What is Encapsulation?

**Encapsulation** is the wrapping up of **data (variables)** and **methods** into a single unit called a **class**, where variables are hidden from direct access outside the class.

### Official Definition

"Binding of data and methods into a single unit (class) with controlled access to variables through methods only"

### Real-World Analogy: Bank Account

```
Scenario Without Encapsulation:
┌─────────────────────────────┐
│  Bank                       │
│  ├─ Account Number          │  ← Directly accessible
│  ├─ Account Holder Name     │  ← Directly accessible
│  └─ Account Balance         │  ← Directly accessible
└─────────────────────────────┘
Anyone can access and modify account details directly
(No security, no validation)
```

```
Scenario With Encapsulation:
┌─────────────────────────────┐
│  Bank                       │
│  ├─ Account Number (private)│  ← Hidden
│  ├─ Holder Name (private)   │  ← Hidden
│  └─ Balance (private)       │  ← Hidden
├─── Getter & Setter Methods  │  ← Controlled access
└─────────────────────────────┘
Access only through verification/methods
(Secure, validated access)
```

### Benefits of Encapsulation

1. **Data Hiding**: Variables are not directly accessible from outside
2. **Controlled Access**: Data can only be modified through defined methods
3. **Validation**: Getter/Setter methods can include validation logic
4. **Flexibility**: Implementation can change without affecting external code
5. **Security**: Protects data from unauthorized direct access

---

## Implementing Encapsulation

### Step 1: Make All Variables Private

```java
public class Account {
    private int accountNumber;
    private String accountName;
    private double amount;
}
```

### Step 2: Create Getter and Setter Methods

For each private variable, create:
- **Setter Method**: To set/assign value to the variable
- **Getter Method**: To get/retrieve value from the variable

#### Manual Implementation

```java
public class Account {
    private int accountNumber;
    private String accountName;
    private double amount;
    
    // Setter for accountNumber
    public void setAccountNumber(int accNumber) {
        this.accountNumber = accNumber;
    }
    
    // Getter for accountNumber
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
    // Setter for accountName
    public void setAccountName(String name) {
        this.accountName = name;
    }
    
    // Getter for accountName
    public String getAccountName() {
        return this.accountName;
    }
    
    // Setter for amount
    public void setAmount(double amt) {
        this.amount = amt;
    }
    
    // Getter for amount
    public double getAmount() {
        return this.amount;
    }
}
```

#### Using Eclipse's Auto-Generation

**Step-by-Step:**

1. Define all private variables in the class
2. Place cursor after variable declarations
3. Go to **Source** menu → **Generate Getters and Setters**
4. Select variables you want to generate getters/setters for
5. Click **Generate**

Eclipse will automatically create all Getter and Setter methods!

### Step 3: Use Only Through Methods

```java
public class AccountMain {
    public static void main(String[] args) {
        Account acc = new Account();
        
        // Set values using Setter methods
        acc.setAccountNumber(101);
        acc.setAccountName("John");
        acc.setAmount(50000);
        
        // Get values using Getter methods
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Name: " + acc.getAccountName());
        System.out.println("Amount: " + acc.getAmount());
    }
}
```

### The `this` Keyword

When method parameter name and class variable name are same, use `this` to distinguish them:

```java
// Without 'this' - confusing which is which
public void setAccountNumber(int accountNumber) {
    accountNumber = accountNumber;  // Wrong! Assignment to parameter itself
}

// With 'this' - clear differentiation
public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;  // this refers to class variable
}
```

### Naming Convention for Getters and Setters

| Variable Name | Getter Method | Setter Method |
|---------------|---------------|---------------|
| `age` | `getAge()` | `setAge(int age)` |
| `name` | `getName()` | `setName(String name)` |
| `salary` | `getSalary()` | `setSalary(double salary)` |
| `isActive` | `isActive()` or `getIsActive()` | `setActive(boolean active)` |

---

## Practical Example: Complete Encapsulation

```java
public class Student {
    // All variables are private
    private int studentID;
    private String studentName;
    private double gpa;
    
    // Setter methods
    public void setStudentID(int id) {
        this.studentID = id;
    }
    
    public void setStudentName(String name) {
        this.studentName = name;
    }
    
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }
    
    // Getter methods
    public int getStudentID() {
        return this.studentID;
    }
    
    public String getStudentName() {
        return this.studentName;
    }
    
    public double getGPA() {
        return this.gpa;
    }
    
    // Additional method to display student info
    public void displayInfo() {
        System.out.println("ID: " + this.studentID);
        System.out.println("Name: " + this.studentName);
        System.out.println("GPA: " + this.gpa);
    }
}
```

### Usage

```java
public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        
        // Set values through setter methods only
        s.setStudentID(101);
        s.setStudentName("Alice");
        s.setGPA(3.8);
        
        // Get values through getter methods only
        System.out.println("ID: " + s.getStudentID());
        System.out.println("Name: " + s.getStudentName());
        
        // Use display method
        s.displayInfo();
    }
}
```

---

## Key Concepts and Comparison

### Polymorphism vs Overloading vs Encapsulation

| Concept | Purpose | Implementation | Example |
|---------|---------|-----------------|---------|
| **Polymorphism** | One thing, many forms (Theory) | Through Overloading | Same method name, different parameters |
| **Overloading** | Multiple methods/constructors with same name | Different parameters | `add(int, int)`, `add(int, int, int)` |
| **Encapsulation** | Hide data, controlled access | Private variables + Getters/Setters | Private fields accessed through methods |

### Rules Summary

#### For Overloading:
1. ✓ Method names can be different data types
2. ✓ Different number of parameters
3. ✓ Different order of parameters
4. ✗ Return type alone doesn't differentiate

#### For Encapsulation:
1. ✓ Make all variables **private**
2. ✓ Create **Setter** methods to set values
3. ✓ Create **Getter** methods to get values
4. ✓ Use **`this` keyword** when parameter name = variable name

---

## Important Notes

### When Variable Name and Parameter Name Are Same

**Problem:**
```java
public void setAccountNumber(int accountNumber) {
    accountNumber = accountNumber;  // Confusing - assigns to itself
}
```

**Solution:**
```java
public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;  // 'this' refers to class variable
}
```

### Why Separate Getters and Setters for Each Variable?

If you have 10 variables, you need:
- 10 Setter methods (to set each one individually)
- 10 Getter methods (to get each one individually)

This provides:
- Granular control over each variable
- Ability to add validation in each method
- Better security and maintainability

### Data Type Matching in Overloading

```java
public void sum(int x, double y) { }

sum(10, 20);      // ✗ Error - both are integers, doesn't match
sum(10, 20.0);    // ✓ Correct - int and double
sum(10.5, 20);    // ✗ Error - doesn't match this signature
```

---

## Best Practices

### For Polymorphism/Overloading:
- Use overloading to provide multiple ways to do similar operations
- Keep related method logic consistent
- Don't create too many overloaded methods (limit to 3-4)
- Document which parameters are required

### For Encapsulation:
- Always make instance variables private
- Always provide public getter/setter methods
- Use meaningful method names (getXxx, setXxx)
- Use `this` keyword when needed for clarity
- Add validation logic in setter methods when appropriate
- Use IDE auto-generation for getters/setters to avoid mistakes

---

## Interview Questions

### Common Questions

1. **What is polymorphism?**
   - One thing can have many forms; achieved through overloading

2. **What are the rules for overloading?**
   - Number of parameters, data type, and order can differ

3. **Why return type doesn't matter in overloading?**
   - Java differentiates methods by signature (name + parameters), not return type

4. **Can main() method be overloaded?**
   - Yes, but JVM only calls `public static void main(String[] args)`

5. **What is encapsulation and why is it important?**
   - Wrapping data and methods together with private variables
   - Provides data hiding and controlled access

6. **What is the purpose of this keyword?**
   - Refers to current object's instance variables
   - Useful when local variable and instance variable have same name

7. **What is the difference between getter and setter?**
   - Getter: retrieves/returns value from variable
   - Setter: assigns/sets value to variable

---

## Key Takeaways

✓ **Polymorphism** = theoretical concept (one thing, many forms)
✓ **Overloading** = practical implementation of polymorphism in Java
✓ **Method Overloading** = multiple methods, same name, different parameters
✓ **Constructor Overloading** = multiple constructors, different parameters
✓ **Encapsulation** = data hiding through private variables and public accessors
✓ **this keyword** = refers to current object's instance variables
✓ **Getters/Setters** = controlled access to private variables
✓ **Return type** = NOT considered in overloading
✓ **Private access** = variable not accessible outside class without getter/setter
✓ **Separate methods** = each variable should have its own getter and setter

---

## Related Files
- [methodAndConstructors.md](methodAndConstructors.md) - Methods and Constructors basics
- [ClassObject.md](ClassObject.md) - Class and Object concepts
- [java.md](Java/java.md) - Java fundamentals
