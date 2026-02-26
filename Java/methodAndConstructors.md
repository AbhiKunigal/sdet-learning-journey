# Methods and Constructors in Java

## Table of Contents
1. [Methods](#methods)
2. [Types of Methods](#types-of-methods)
3. [Storing Data in Variables](#storing-data-in-variables)
4. [Constructors](#constructors)
5. [Method vs Constructor](#method-vs-constructor)

---

## Methods

### What is a Method?

A **method** is a block or group of statements that performs a specific task. It allows you to:
- Write code once and reuse it multiple times
- Avoid repetitive code by calling the method whenever needed
- Execute a particular task only when called

### Key Concepts

- **Location**: Methods are created inside a class
- **Invocation**: Methods are called through an object of the class
- **Execution**: The logic inside a method executes only when the method is explicitly called

### Types of Methods

There are two main categories:

1. **Built-in Methods**
   - Pre-defined methods already available in Java
   - Part of Java classes (e.g., String methods)
   - You only need to call them, not create them

2. **User-Defined Methods**
   - Custom methods created according to your requirements
   - Written by the programmer
   - Tailored to specific needs

---

## Types of Methods

Based on **parameters** and **return values**, methods can be categorized into four types:

### 1. No Parameters, No Return Value

**Syntax:**
```java
void methodName() {
    // Code to execute
    System.out.println("Hello");
}
```

**Example:**
```java
public void greet() {
    System.out.println("Hello");
}
```

**How to Call:**
```java
Greetings g = new Greetings();
g.greet();  // No parameters, no return value needed
```

---

### 2. No Parameters, Return Value

**Syntax:**
```java
returnType methodName() {
    // Code to execute
    return value;
}
```

**Example:**
```java
public String getMessage() {
    return "Hello, how are you?";
}
```

**How to Call:**
```java
String message = g.getMessage();  // Store the returned value
System.out.println(message);       // Print the result
```

---

### 3. Parameters, No Return Value

**Syntax:**
```java
void methodName(parameterType parameter) {
    // Code to execute
}
```

**Example:**
```java
public void greetPerson(String name) {
    System.out.println("Hello " + name);
}
```

**How to Call:**
```java
g.greetPerson("John");  // Pass parameter, no return value needed
```

**Multiple Parameters:**
```java
public void greetPerson(String name, int age) {
    System.out.println("Hello " + name + ", age: " + age);
}

g.greetPerson("John", 25);
```

---

### 4. Parameters and Return Value

**Syntax:**
```java
returnType methodName(parameterType parameter) {
    // Code to execute
    return value;
}
```

**Example:**
```java
public String createGreeting(String name) {
    return "Hello " + name;
}
```

**How to Call:**
```java
String greeting = g.createGreeting("John");
System.out.println(greeting);  // Print the returned value
```

---

## Storing Data in Variables

There are **three approaches** to store data in class variables:

### Approach 1: Direct Access Through Object

Access variables directly through the object and assign values.

**Example:**
```java
public class Student {
    int studentID;
    String name;
    char grade;
    
    public void printStudentData() {
        System.out.println(studentID + " " + name + " " + grade);
    }
}

// In main method:
Student s = new Student();
s.studentID = 101;
s.name = "David";
s.grade = 'A';
s.printStudentData();
```

**Advantages:**
- Simple and direct approach
- Minimal code required

---

### Approach 2: Using a Method (Setter Method)

Create a method to receive data and assign it to class variables.

**Example:**
```java
public class Student {
    int studentID;
    String name;
    char grade;
    
    // Method to set student data
    public void setStudentData(int id, String studentName, char gradeValue) {
        this.studentID = id;           // Class variable
        this.name = studentName;       // Class variable
        this.grade = gradeValue;       // Class variable
    }
    
    public void printStudentData() {
        System.out.println(studentID + " " + name + " " + grade);
    }
}

// In main method:
Student s = new Student();
s.setStudentData(101, "David", 'A');
s.printStudentData();
```

**Key Points:**
- **Local Variables**: Parameters in the method (`id`, `studentName`, `gradeValue`)
- **Class Variables**: Variables declared in the class (`studentID`, `name`, `grade`)
- Local variables are temporary and exist only within the method
- Class variables are accessible throughout the entire class

---

### Approach 3: Using Constructor

Use a **Constructor** to automatically initialize data when an object is created.

**Example:**
```java
public class Student {
    int studentID;
    String name;
    char grade;
    
    // Constructor - automatically called at object creation
    public Student(int id, String studentName, char gradeValue) {
        this.studentID = id;
        this.name = studentName;
        this.grade = gradeValue;
    }
    
    public void printStudentData() {
        System.out.println(studentID + " " + name + " " + grade);
    }
}

// In main method:
Student s = new Student(101, "David", 'A');  // Constructor invoked automatically
s.printStudentData();
```

**Advantages:**
- Data is initialized at object creation time
- Most preferred approach in modern Java

---

## Constructors

### What is a Constructor?

A **Constructor** is a special method used to initialize objects. It is automatically called when you create an object using the `new` keyword.

### Constructor Syntax

```java
className() {
    // Constructor body - only assignment, no return statement
}
```

### Key Characteristics

| Aspect | Description |
|--------|-------------|
| **Name** | Must be same as the class name |
| **Return Type** | No return type (not even `void`) |
| **Parameters** | Can accept parameters (optional) |
| **Invocation** | Automatically called at object creation |
| **Purpose** | Initialize data into class variables |
| **Code** | Only contain variable assignments, no logic or operations |

---

### Types of Constructors

#### 1. Default Constructor (No Parameters)

```java
public class ConstructorDemo {
    int x;
    int y;
    
    // Default Constructor
    public ConstructorDemo() {
        x = 100;
        y = 200;
    }
    
    public void sum() {
        System.out.println(x + y);
    }
}

// Usage:
ConstructorDemo cd = new ConstructorDemo();  // Default constructor called
cd.sum();  // Output: 300
```

---

#### 2. Parameterized Constructor

```java
public class ConstructorDemo {
    int x;
    int y;
    
    // Parameterized Constructor
    public ConstructorDemo(int a, int b) {
        x = a;
        y = b;
    }
    
    public void sum() {
        System.out.println(x + y);
    }
}

// Usage:
ConstructorDemo cd = new ConstructorDemo(10, 20);  // Parameterized constructor called
cd.sum();  // Output: 30
```

---

### Multiple Constructors in One Class

You can have both default and parameterized constructors:

```java
public class Student {
    int studentID;
    String name;
    
    // Default Constructor
    public Student() {
        studentID = 0;
        name = "Unknown";
    }
    
    // Parameterized Constructor
    public Student(int id, String studentName) {
        studentID = id;
        name = studentName;
    }
}

// Usage:
Student s1 = new Student();           // Calls default constructor
Student s2 = new Student(101, "John"); // Calls parameterized constructor
```

---

## Method vs Constructor

### Comparison Table

| Feature | Method | Constructor |
|---------|--------|-------------|
| **Name** | Can be any name | Must be same as class name |
| **Return Type** | May or may not return a value | Never returns any value (no `void` needed) |
| **Parameters** | Can accept parameters | Can accept parameters |
| **Invocation** | Must be called explicitly through object | Automatically invoked at object creation |
| **Purpose** | Execute logic and operations | Initialize data in variables |
| **Code Contains** | Logic, calculations, conditions, loops | Only variable assignments |
| **Calling Syntax** | `object.methodName()` | Automatic (used with `new` keyword) |

### Summary

| Aspect | Method | Constructor |
|--------|--------|-------------|
| **When to Use** | To implement logic | To initialize data |
| **Example** | Perform calculations, print data | Set initial values of variables |
| **Return Statement** | Optional (depends on requirement) | Never use return statement |

---

## Best Practices

### For Methods:
- Use clear, descriptive method names
- Keep methods focused on a single task
- Use parameters to pass input data
- Return values when computation is needed

### For Constructors:
- Always initialize all class variables in the constructor
- Use parameterized constructors for flexibility
- Keep constructor code simple (only assignments)
- Never include complex logic or loops in constructors

### For Variable Assignment:
- **Prefer Constructor approach** for initializing data (most common practice)
- Use setter methods for modifying data after object creation
- Avoid direct object property access in larger applications

---

## Key Takeaways

1. **Methods** are reusable blocks of code that execute a specific task
2. Methods can have **4 different combinations** of parameters and return values
3. **Constructors** are special methods for initializing objects
4. Constructors are **automatically invoked** when objects are created
5. Use **Constructors** to initialize data, **Methods** to perform operations
6. You can have **multiple Constructors** in a single class (with different parameters)
7. **Constructor name** must match the class name exactly

---

## Example Program

```java
public class Greetings {
    // Method with no parameters, no return value
    public void greet() {
        System.out.println("Hello");
    }
    
    // Method with no parameters, return value
    public String getMessage() {
        return "Hello, how are you?";
    }
    
    // Method with parameters, no return value
    public void greetPerson(String name) {
        System.out.println("Hello " + name);
    }
    
    // Method with parameters and return value
    public String createGreeting(String name) {
        return "Hello " + name;
    }
}

public class GreetingsMain {
    public static void main(String[] args) {
        Greetings g = new Greetings();
        
        g.greet();                    // Type 1
        System.out.println(g.getMessage());  // Type 2
        g.greetPerson("John");        // Type 3
        System.out.println(g.createGreeting("John"));  // Type 4
    }
}
```

---

## Related Files
- [ClassObject.md](ClassObject.md) - Understanding Classes and Objects
- [java.md](Java/java.md) - Java Fundamentals
