# Type Casting in Java -- Complete Notes

------------------------------------------------------------------------

## 1. What is Type Casting?

**Type Casting** means converting data from one type to another type.

Type casting is applicable to: - Primitive Data Types - Object Types
(OOP)

There are two types of casting:
 1. Upcasting (Widening)
 2. Downcasting (Narrowing)

------------------------------------------------------------------------

# PART 1: Type Casting with Primitive Data Types

## 2. Upcasting (Widening)

### Definition

Converting a value from a smaller type to a larger type.

Hierarchy (size-wise): byte → short → int → long → float → double

### Key Points

-   Smaller → Larger
-   Automatic process
-   No explicit casting required
-   No data loss

### Example

``` java
int value = 100;
long longValue = value;   // Upcasting
System.out.println(longValue);
```

------------------------------------------------------------------------

## 3. Downcasting (Narrowing)

### Definition

Converting a value from a larger type to a smaller type.

### Key Points

-   Larger → Smaller
-   Manual process
-   Explicit casting required
-   May cause data loss

### Example

``` java
double d = 10.5;
int i = (int) d;   // Decimal part lost
System.out.println(i);  // Output: 10
```

------------------------------------------------------------------------

# PART 2: Type Casting with Objects (OOP)

Object casting works only when there is a parent-child relationship.

## Parent-Child Example

``` java
class Parent {
    String name = "John";
    void m1() {
        System.out.println("Method from Parent");
    }
}

class Child extends Parent {
    int id = 101;
    void m2() {
        System.out.println("Method from Child");
    }
}
```

------------------------------------------------------------------------

## Object Upcasting

``` java
Parent p = new Child();
```

-   Child object stored in Parent reference
-   Automatic
-   Can access only Parent members

------------------------------------------------------------------------

## Object Downcasting

``` java
Parent p = new Child();
Child c = (Child) p;
```

-   Explicit casting required
-   Allows access to Child members
-   May throw ClassCastException at runtime

------------------------------------------------------------------------

# Three Important Rules of Object Casting

## Rule 1: Conversion Validity

There must be a relationship between types.

If no relationship → Compile-time error.

## Rule 2: Assignment Validity

After casting, the result must be storable in the reference variable.

If assignment type mismatch → Compile-time error.

## Rule 3: Underlying Object Check

The actual object must be compatible at runtime.

If not → Runtime error (ClassCastException).
