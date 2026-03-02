# Inheritance in Java

A beginner-friendly guide to inheritance—one of the four pillars of Object-Oriented Programming (OOP). This document covers definition, types, advantages, and why multiple inheritance is not supported with classes.

---

## 1. What is Inheritance?

**Definition:**  
Inheritance is the process of acquiring variables (properties) and methods (behavior) from one class into another.

- A **parent class** (also called base class or superclass) contains common variables and methods.
- A **child class** (also called derived class or subclass) acquires these from the parent using the `extends` keyword.
- The child class can use parent members and also add its own.

**Syntax:**
```java
class Parent {
    int a = 100;
    void display() {
        System.out.println("From Parent: " + a);
    }
}

class Child extends Parent {
    int b = 200;
    void show() {
        System.out.println("From Child: " + b);
    }
}
```

**Key point:** When you create a `Child` object, it has access to both its own members and all members from `Parent`.

---

## 2. Advantages of Inheritance

### **A. Reusability**
- Write code once (in parent), use it many times (in multiple children).
- No need to recreate the same variables and methods repeatedly.

### **B. Avoid Duplication**
- Common functionality is centralized in the parent.
- Reduces code length and maintenance effort.

### **Real-World Scenario: Banking Application**

Imagine a banking app with multiple loan modules:

**Without Inheritance:**
- Personal Loan Module: 10 classes, 10 hours of work
- Home Loan Module: 20 classes, 20 hours of work
- **Total: 30 hours**

**With Inheritance:**
- Identify 5 common classes across both modules.
- Create these 5 classes once (5 hours).
- Personal Loan: extend those 5, add 5 new (5 hours more = 10 total)
- Home Loan: extend those 5, add 15 new (15 hours more = 20 total)
- **Total: 5 + 5 + 15 = 25 hours** (saved 5 hours!)

This demonstrates the power of inheritance for large projects.

---

## 3. Types of Inheritance

There are **four types of inheritance** in Java:

### **Type 1: Single Inheritance**
One parent class, one child class.

```
Parent
  ↓
Child
```

```java
class Parent {
    int a = 100;
    void display() { System.out.println("a = " + a); }
}

class Child extends Parent {
    int b = 200;
    void show() { System.out.println("b = " + b); }
}

// Usage
Child obj = new Child();
obj.display();  // from Parent
obj.show();     // from Child
```

### **Type 2: Multi-Level Inheritance**
A chain of parent-to-child relationships across multiple levels.

```
Parent
  ↓
Child (is parent for...)
  ↓
GrandChild
```

```java
class Parent {
    int a = 100;
    void display() { System.out.println("a = " + a); }
}

class Child extends Parent {
    int b = 200;
    void show() { System.out.println("b = " + b); }
}

class GrandChild extends Child {
    int c = 300;
    void print() { System.out.println("c = " + c); }
}

// Usage
GrandChild obj = new GrandChild();
obj.display();  // from Parent
obj.show();     // from Child
obj.print();    // from GrandChild
```

### **Type 3: Hierarchy Inheritance**
One parent class, multiple child classes (siblings).

```
       Parent
      /      \
   Child1   Child2
```

```java
class Parent {
    void display(int a) { System.out.println("a = " + a); }
}

class Child1 extends Parent {
    void show(int b) { System.out.println("b = " + b); }
}

class Child2 extends Parent {
    void print(int c) { System.out.println("c = " + c); }
}

// Usage
Child1 c1 = new Child1();
c1.display(100);  // from Parent
c1.show(200);     // from Child1

Child2 c2 = new Child2();
c2.display(500);  // from Parent
c2.print(1000);   // from Child2
```

### **Type 4: Multiple Inheritance**
Multiple parent classes, one child class.

```
Parent1    Parent2
   \        /
    Child
```

**Java does NOT support multiple inheritance using classes** (more on this below).

---

## 4. Why Multiple Inheritance is NOT Supported in Java

### **The Ambiguity Problem**

Suppose two parent classes have a method with the same name:

```java
class Parent1 {
    void method() { System.out.println("From Parent1"); }
}

class Parent2 {
    void method() { System.out.println("From Parent2"); }
}

// This is NOT allowed in Java:
// class Child extends Parent1, Parent2 { }
```

If a child tried to extend both, the compiler wouldn't know which `method()` to inherit. **This is the ambiguity problem.**

### **The Object Class Connection**

Even more important: **Every class in Java automatically extends from a built-in `Object` class.**

```
Object (has: equals(), toString(), hashCode(), wait(), notify(), etc.)
  ↓
Any class you create (inherits all Object's methods automatically)
```

**This means:**
- `Parent1` has: its own methods + all methods from `Object`
- `Parent2` has: its own methods + all methods from `Object`
- They both share the same methods from `Object` (duplicates!)

When the child tries to inherit from both, it encounters duplicate methods and cannot decide which version to use.

### **Example: Object Class Methods**

```java
class X {
    // You don't write anything here
}

class Y {
    public static void main(String[] args) {
        X obj = new X();
        obj.equals(...);    // comes from Object
        obj.toString();     // comes from Object
        obj.hashCode();     // comes from Object
        obj.getClass();     // comes from Object
        // All these are inherited automatically!
    }
}
```

---

## 5. How to Achieve Multiple Inheritance

### **Solution: Use Interfaces**

Java provides **interfaces** as an alternative to classes. You can implement multiple interfaces but cannot extend multiple classes.

```java
interface Parent1 {
    void method1();
}

interface Parent2 {
    void method2();
}

class Child implements Parent1, Parent2 {
    public void method1() { System.out.println("Method1"); }
    public void method2() { System.out.println("Method2"); }
}
```

**Key Differences:**
- `extends` = acquire implemented methods and variables (inheritance)
- `implements` = fulfill contract; you write the implementation (implementation)

(Interfaces will be covered in detail in a later session.)

---

## 6. Important Rules

1. **One file, one public class:** Only one class per `.java` file can have `public` access.
2. **No duplicate class names in a package:** Even in different files, class names must be unique.
3. **extends supports only one class:** You cannot write `class Child extends Parent1, Parent2`.
4. **Every class is a subclass of Object:** Automatically, no explicit code needed.
5. **Child can be any type:**
   - Child can be a class (most common)
   - Child can be an interface
   - Parent must be a class (when using `extends`)

---

## 7. Key Takeaways

| Concept | Single | Multi-Level | Hierarchy | Multiple |
|---------|--------|-------------|-----------|----------|
| **Structure** | 1 parent, 1 child | Parent → Child → GrandChild | 1 parent, many children | Multiple parents, 1 child |
| **Supported with classes?** | ✓ Yes | ✓ Yes | ✓ Yes | ✗ No |
| **Supported with interfaces?** | ✓ Yes | ✓ Yes | ✓ Yes | ✓ Yes |

---

## 8. Interview Q&A

**Q: What is inheritance?**  
A: Acquisition of variables and methods from a parent class to a child class.

**Q: What are the advantages of inheritance?**  
A: Reusability and avoiding code duplication.

**Q: Why is multiple inheritance not supported in Java with classes?**  
A: Because of the ambiguity problem—the child wouldn't know which parent's method to inherit when both parents have the same method. Also, every class inherits from `Object`, so duplicate methods are already present.

**Q: What is the difference between `extends` and `implements`?**  
A: `extends` is used when the parent is a class (child inherits implemented methods). `implements` is used when the parent is an interface (child must implement abstract methods).

**Q: Does Java support multiple inheritance?**  
A: Not directly with classes, but you can achieve it using interfaces.

**Q: What is the Object class?**  
A: The root parent class of all classes in Java. Every class automatically inherits from it, even if you don't explicitly write `extends Object`.

---

## 9. Practice Exercise

Create a simple hierarchy:
1. Define a `Vehicle` class with common variables (name, speed) and methods (display()).
2. Create child classes: `Car` and `Bike`, each with their own specific methods.
3. In `main`, create objects and test access to both parent and child members.

Example:
```java
class Vehicle {
    String name = "Vehicle";
    void display() { System.out.println("Name: " + name); }
}

class Car extends Vehicle {
    void honk() { System.out.println("Car honking!"); }
}

class Bike extends Vehicle {
    void ring() { System.out.println("Bike ringing!"); }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();  // from Vehicle
        c.honk();     // from Car
    }
}
```

---


