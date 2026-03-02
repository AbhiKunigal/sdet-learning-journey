# Method Overriding, Final and Super Keywords

## Introduction
These concepts are fundamental to Object-Oriented Programming and are closely related to **Inheritance**. They help us understand how child classes can modify and extend parent class behavior.

---

## 1. Method Overriding (Method Overwriting)

### What is Method Overriding?
Method overriding means rewriting a method that already exists in the parent class within the child class. It allows child classes to have their own implementation of the same method.

### Example Scenario
```
Parent Class:
- Method: M1()
- Implementation: Some code

Child Class (extends Parent):
- Same Method: M1()
- New Implementation: Different code
```

### Why is Method Overriding Required?
- Sometimes we may not like the implementation in the parent class
- The parent class implementation might be old logic
- Child classes can customize the method according to their own requirements
- Changes in child class do NOT impact the parent class

### Rules for Method Overriding
**The Declaration part should NEVER change:**
- Return type must be the same
- Method name must be the same
- Number of parameters must be the same
- Order of parameters must be the same
- Data type of parameters must be the same

**Only the Implementation (body) should change**

### Real-World Example (House Renovation)
- Parent has a house (method implementation)
- Child inherits the house (same method)
- Child renovates the house (changes implementation)
- The structure remains the same, only customization is done

### Method Overriding is Possible Only with Inheritance
- At least **two classes** are required (one parent, one child)
- Without inheritance, we cannot achieve overriding
- Can be done across multiple levels of inheritance (in child, grandchild, etc.)
- Each class can override the method wherever needed

### Example: Bank Rates of Interest
```
Parent Class: Bank
- Method: getRateOfInterest()
- Implementation: return 0.0

Child Class: ICICI (extends Bank)
- Same Method: getRateOfInterest()
- New Implementation: return 10.5

Child Class: SBI (extends Bank)
- Same Method: getRateOfInterest()
- New Implementation: return 11.5
```

When you create objects and call the method:
- `bank.getRateOfInterest()` → returns 0.0
- `icici.getRateOfInterest()` → returns 10.5
- `sbi.getRateOfInterest()` → returns 11.5

### Key Points about Inheritance Types in Overriding
- **Hierarchical Inheritance**: One parent, multiple children (ICICI and SBI both extend Bank)
- Can override in any child class wherever required
- If not overridden, the same implementation is inherited by all child classes

---

## 2. Method Overloading vs Method Overriding

### Comparison Table

| Aspect | Method Overloading | Method Overriding |
|--------|-------------------|-------------------|
| **Definition** | Same method name with different declaration | Same method with different implementation only |
| **Concept Related To** | Polymorphism | Inheritance |
| **Classes Required** | Can work with single or multiple classes | Requires at least two classes (parent & child) |
| **Signature Change** | Declaration MUST change (parameters) | Declaration MUST NOT change |
| **Implementation** | Can be same or different | MUST be different |
| **Where Applicable** | Single class or multiple classes | Only in inherited classes |
| **Common Point** | Method name is same | Method name is same |

### Declaration vs Implementation
```
Declaration = Return Type + Method Name + Parameters (Type and Order)
Implementation = Method Body/Logic
```

### Example: Overloading with Inheritance

**Parent Class ABC:**
```
Method: void M1(int a) → prints a
Method: void M2(int b) → prints b
```

**Child Class XYZ (extends ABC):**
```
Method: void M1(int a) → prints a*a (OVERRIDING)
Method: void M2(int b) → prints b*b (OVERRIDING the same parameter)
Method: void M2(int a, int b) → prints a+b (OVERLOADING - different parameters)
```

**Total Methods in XYZ:**
- M1 with single parameter (overridden)
- M2 with single parameter (inherited from ABC, NOT overridden)
- M2 with two parameters (overloaded)
= **3 Methods total**

### Key Distinctions
- **Overloading**: Only method name is same, declaration changes
- **Overriding**: Method name same, declaration unchanged, only implementation changes
- Both can exist together in the same class

---

## 3. Final Keyword

### What is Final Keyword?
The `final` keyword is used to apply security or privacy on variables, methods, and classes. It prevents modification at different levels.

### Applications of Final Keyword
Final can be applied to:
1. **Variables**
2. **Methods**
3. **Classes**

---

### 3.1 Final Variables

#### Behavior
When a variable is declared as `final`, the value of the variable becomes **constant** and **cannot be changed**.

#### Example
```java
class Test {
    int x = 100;  // Non-final - value can be changed
}

Test t = new Test();
t.x = 200;  // ✓ This works - value changed to 200

class Test {
    final int x = 100;  // Final - value is constant
}

Test t = new Test();
t.x = 200;  // ✗ ERROR: cannot assign to final variable
```

#### Key Point
- Initial value: 100
- After applying `final`: Value becomes CONSTANT
- Cannot be changed anywhere in the program
- Makes variable IMMUTABLE

---

### 3.2 Final Methods

#### Behavior
When a method is declared as `final`, the method **cannot be overridden** in child classes.

#### Example
```java
class Parent {
    final void M1() {
        // Implementation
    }
}

class Child extends Parent {
    void M1() {  // ✗ ERROR: cannot override final method
        // Different implementation
    }
}
```

#### Error Message
"Cannot override the final method from Parent class"

#### Purpose
- If you don't want child classes to override a method
- Restrict modification of specific methods
- Ensure method behavior remains consistent across inheritance hierarchy

#### Important Note
- Final methods **CAN STILL BE OVERLOADED** (different parameters = different method)
- Overloading works because we're creating a NEW method, not overriding

#### Example: Final Method with Overloading
```java
class Parent {
    final void M1(int a) {
        // Implementation
    }
}

class Child extends Parent {
    final void M1(int a) {  // ✗ Cannot override
    }
    
    void M1(int a, int b) {  // ✓ OK - This is overloading, not overriding
    }
}
```

---

### 3.3 Final Classes

#### Behavior
When a class is declared as `final`, the class **cannot be extended** into child classes.

#### Example
```java
final class Parent {
    // Class content
}

class Child extends Parent {  // ✗ ERROR: Cannot extend final class
    // Child content
}
```

#### Error Message
"The type Child cannot subclass the final class Parent"

#### Purpose
- If you don't want anyone to extend your class
- Prevent inheritance of the class altogether
- Ensure class behavior remains unchanged

#### Use Cases
- Security-sensitive classes
- Classes that should not be modified through inheritance
- Framework classes that should not be extended

---

## 4. Comparing Final with Static

### Important: DO NOT CONFUSE FINAL WITH STATIC

| Aspect | Final | Static |
|--------|-------|--------|
| **Variable Behavior** | Value is CONSTANT (cannot change) | Value can change, but shared across all objects |
| **Default Value** | Cannot be changed from initial value | Can be changed anytime (class or object level) |
| **Methods** | Cannot be overridden | Can be overridden, can be overloaded |
| **Classes** | Cannot be extended | "Static classes" do NOT exist in Java |
| **Context** | Security/Immutability | Shared across all instances |
| **Scope** | Variables, Methods, Classes | Variables and Methods only |

### Key Differences
- **Static variable**: Default value is 100, but value can be changed across multiple objects
- **Final variable**: Value is 100 and remains 100 forever (IMMUTABLE)

---

## 5. Super Keyword

### What is Super Keyword?
The `super` keyword is used to **refer to the immediate parent class** in inheritance. It allows you to access parent class variables and methods even when they have been overridden in the child class.

### When is Super Used?
Super is used ONLY in **inheritance context**. It has no other use.

### Scenario for Using Super

**Situation:**
- Override a variable in child class with new value
- Override a method in child class with new implementation
- But still need to access the parent class's original value/implementation

**Solution:** Use `super` keyword

### Rule
**Super represents the IMMEDIATE parent class ONLY**

---

### 5.1 Super with Variables

#### Example
```java
class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";
    
    void display() {
        System.out.println(color);      // Output: Black (child value)
        System.out.println(super.color);  // Output: White (parent value)
    }
}

// Usage
Dog d = new Dog();
d.display();

// Output:
// Black
// White
```

#### Explanation
- `color` returns the child class value: Black
- `super.color` returns the parent class value: White
- Same object, but different values accessed based on `super` usage

---

### 5.2 Super with Methods

#### Example
```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Eating Bread");
        super.eat();  // Calls parent method
    }
}

// Usage
Dog d = new Dog();
d.eat();

// Output:
// Eating Bread (child implementation)
// Eating (parent implementation - via super)
```

#### Explanation
- Child class method executes first: "Eating Bread"
- `super.eat()` invokes parent method: "Eating"
- Both implementations execute

---

### 5.3 Super in Multi-Level Inheritance

#### Important Concept
Super refers to the **IMMEDIATE parent class ONLY**, not grandparent or other ancestors.

#### Example: Multi-Level Inheritance
```
Class A (Grandparent)
├── Class B (Parent)
    └── Class C (Child)
```

```java
class C extends B {
    void method() {
        super.variable;  // Accesses B's variable (immediate parent)
        // NOT A's variable (grandparent)
    }
}
```

#### Limitation
- In multi-level inheritance, `super` only works with immediate parent
- Cannot directly access grandparent class variables/methods using `super`
- Each class in hierarchy can use `super` to access its immediate parent

---

### 5.4 Super and Multiple Inheritance

#### Important Restriction
Super keyword **CANNOT be used with Multiple Inheritance** (using interfaces).

#### Reason
- Multiple inheritance has multiple immediate parents
- Super cannot determine which parent to refer to
- Super is only applicable with Classes, NOT Interfaces
- Multiple inheritance in Java is achieved through Interfaces, which do not support `super`

---

## Summary of Key Concepts

### Method Overriding
- Same method, different implementation
- Child classes customize parent methods
- Requires inheritance
- Declaration must be identical

### Final Keyword
- **Variables**: Make them constant/immutable
- **Methods**: Prevent overriding in child classes
- **Classes**: Prevent extending into child classes
- Provides security and consistency

### Super Keyword
- Access immediate parent class variables
- Access immediate parent class methods
- Works only in inheritance
- Refers to immediate parent ONLY (not grandparent)
- Not applicable with multiple inheritance

---

## Next Topics
- Abstract Classes
- Interfaces
- Multiple Inheritance using Interfaces
