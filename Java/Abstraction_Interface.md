# Abstraction & Interface Notes (Transcript Reframe)

> This file now reflects the original lecture transcript in a reorganized, concise format. The emphasis is on the core differences between interfaces and abstract classes and how Java implements abstraction.

## 🎯 What is Abstraction?
Abstraction means hiding the implementation details and showing only the functionality to the user. In other words, the hidden part (what is inside) is abstracted; the user interacts with the interface without caring how it works.

Two primary mechanisms in Java:
1. **Abstract class** – provides partial abstraction and may include code or state.
2. **Interface** – provides full abstraction; only the behaviour is specified, not the implementation.

> Example: with a mobile phone, you know how to operate apps but not how they are implemented – the implementation is hidden, which is abstraction.

## 🧠 Abstract Class Highlights
- Declared with `abstract class`.
- Can include both **abstract** and **concrete** methods.
- May have **instance variables**, constructors, and initializer blocks.
- Members can be `private`, `protected`, `public`, or default.
- A class can **extend only one** abstract class.
- Useful when subclasses share common code or state.

## 📘 Interface Highlights
1. Declared with the `interface` keyword – an interface is a blueprint of a class.
2. Interfaces contain final & static variables (constants); `public static final` is implicit.
3. Only method signatures are allowed; before Java 8 only abstract methods existed. (Default and static methods permitted from Java 8, private methods from Java 9.)
4. An abstract method has a signature but no body – it’s unimplemented.
5. All methods in an interface are implicitly public; visibility cannot be reduced when implemented.
6. Interfaces support multiple inheritance: a class can implement many interfaces, and interfaces can extend multiple interfaces.
7. A class extends another class; an interface extends another interface; a class implements an interface.
8. Interfaces cannot be instantiated – only references may be declared.
9. No instance fields, constructors, or initialization blocks are allowed.

### 🔗 Reference Rules
```java
MyInterface ref;                     // OK
ref = new ImplementingClass();       // assign an object
```
### 🔗 Reference Rules
```java
MyInterface ref;                     // OK
ref = new ImplementingClass();       // assign an object
```
Interface references allow polymorphism and hide implementation details.

## 🔄 Inheritance Patterns
- **Multiple inheritance via interfaces**
- **Hybrid inheritance** (extend a class, implement interfaces)
- Syntax: `class C extends A implements I1, I2 { ... }` (extends first)

## 🚀 Why Use Interfaces?
Interfaces define *what* should be done; they let different classes implement it in their own way. Ideal for APIs and frameworks where the implementation may vary (e.g., `WebDriver`).

> **Design tip**: Use an interface when you need multiple inheritance or a pure contract. Use an abstract class when related classes share logic or data.

### 📝 Exact Differences from Image
1. Abstract class can have both abstract and non-abstract methods; interface can have only abstract methods (default/static allowed from Java 8).
2. Abstract class doesn’t support multiple inheritance; interface supports multiple inheritance.
3. Abstract class can have final, non-final, static and non-static variables; interface has only static final variables.
4. Abstract class can provide implementation of an interface; interface can’t provide implementation of an abstract class.
5. The keyword `abstract` is used to declare abstract class; `interface` keyword declares an interface.
6. An abstract class can extend another Java class and implement multiple Java interfaces; an interface can extend another Java interface only.
7. An abstract class is extended using the keyword `extends`; an interface is implemented using the keyword `implements`.
8. A Java abstract class can have class members like private, protected, etc.; members of a Java interface are public by default.

**Examples:**
- Abstract class:
  ```java
  public abstract class Shape {
      public abstract void draw();
  }
  ```
- Interface:
  ```java
  public interface Drawable {
      void draw();
  }
  ```
