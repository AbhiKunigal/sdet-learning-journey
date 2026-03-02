
**`this` Keyword**

- **Purpose:** refers to the current object (instance) of the class.
- **Main uses:**
  - Differentiate instance (class) variables from local variables or parameters when names collide.
  - Call another constructor in the same class (`this(...)`) — constructor chaining.
  - Return the current object (`return this;`) for fluent APIs.

- **Example (constructor & method):**

```java
public class Point {
    private int x; // instance variable
    private int y; // instance variable

    // Constructor: parameters have same names as instance fields
    public Point(int x, int y) {
        this.x = x; // 'this.x' is the instance variable; 'x' is the parameter
        this.y = y;
    }

    // Setter example using this
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x=" + x + ", y=" + y);
    }
}
```

- **Pitfall:** If you forget `this` when names collide (e.g., `x = x;`), the assignment updates the parameter/local variable, leaving the instance field unchanged (default values may remain), causing logical errors.

**`static` Keyword**

- **Purpose:** marks members (variables or methods) as belonging to the class itself rather than to individual instances. Static members are shared across all objects of that class.
- **When to use:** for data or behavior common to all instances (e.g., `companyName`, constants, utility methods).
- **Benefits:**
  - Avoid duplication of identical data in every object (memory savings).
  - Single place to update commonly-shared data (one update is visible to all instances).

- **Types:**
  - Static variables (class variables)
  - Static methods

- **Access rules (must remember):**
  1. Static methods can access static variables/methods directly (no object required).
  2. Static methods cannot directly access non-static (instance) variables/methods — to do so they must use an object reference.
  3. Non-static methods (instance methods) can access both static and non-static members directly.
  4. From another class, access a static member with `ClassName.member` (no instance needed).

- **Example (Employee department):**

```java
public class Employee {
    public String name;        // instance
    public int id;             // instance
    public static int deptNo = 10; // static: shared across all Employee objects
}

// Access without creating an Employee instance:
System.out.println(Employee.deptNo);

// Change dept for all employees:
Employee.deptNo = 20; // reflects everywhere

// If you need to access instance fields from a static method:
Employee e = new Employee();
e.name = "Alice"; // use an object
```

- **Memory and modification problems solved by `static`:**
  - Duplication: a single copy of the static field is stored instead of repeated copies per object.
  - Update/maintenance: change once at class-level rather than updating every object.

- **When NOT to use `static`:**
  - If each object must maintain its own independent value (e.g., `salary`, `employeeId`), do not make it static.

**`main` Method and `static`**

- Standard signature: `public static void main(String[] args)`
  - `public`: JVM must access it from outside the class.
  - `static`: JVM calls it without creating an instance of the class.
  - `void`: it doesn't return a value to the JVM.
  - `String[] args`: optional command-line arguments.

- A few notes:
  - The order of `public` and `static` can be interchanged (`static public void main...`) — JVM accepts it.
  - The return type (`void`) must appear immediately before the method name; you cannot move `void` after `static` in a way that breaks the method declaration.
  - You can overload `main` with different signatures, but JVM looks for the exact `public static void main(String[] args)` signature to start execution.

**`System.out.println` explained**

- `System` is a predefined class. `out` is a static field of type `PrintStream`. `println(...)` is a method of `PrintStream`.
- So `System.out.println("hi")` means: access the static `out` field on `System`, then call `println` on that `PrintStream` object.

**Common Pitfalls & Tips**

- Using the same names for parameters and instance fields without `this` causes logical bugs.
- Overusing `static` makes code less flexible and harder to reason about — only use it for true class-level data/behavior.
- For thread-shared data, `static` fields need careful synchronization when accessed/modified concurrently.

**Quick Interview Q&A**

- Q: Why use `this`? — A: To reference the current object and disambiguate instance fields from locals/parameters.
- Q: What does `static` do? — A: Makes a member belong to the class rather than to instances; it is shared and stored once per class.
- Q: Can a static method use instance variables? — A: Not directly; it must use an object reference.
- Q: Why is `main` static? — A: So JVM can invoke it without creating an object.

**Short checklist (remember)**

- **`this`:** use when parameter/local names collide with instance fields; also for constructor chaining and returning current object.
- **`static`:** use for shared, constant, or utility members. Static methods -> access static members directly; to access instance members use an instance.

Practice: create a small class with instance fields and one shared static field (e.g., `companyName`), instantiate multiple objects, and observe how changing the static field affects all instances.

----

File created: [thisAndStaticKeywords.md](thisAndStaticKeywords.md)
