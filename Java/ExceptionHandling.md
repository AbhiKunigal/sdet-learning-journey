# Exception Handling in Java – Complete Notes

---

# 1. Introduction

An **Exception** is an event that terminate the execution of program.

Exception Handling in Java is a mechanism used to handle runtime errors so that the normal flow of the program can be maintained.

If an exception is not handled:
- Program execution stops immediately
- Remaining statements are not executed
- Program terminates abnormally

---

# 2. Error vs Exception

## 2.1 Errors

Errors are caused by developer mistakes while writing code.

### Types of Errors

### 1) Syntax Errors
- Violation of Java syntax rules
- Missing semicolon (`;`)
- Missing curly braces (`{}`)
- Incorrect capitalization
- Program will not compile
- Detected by compiler

### 2) Logical Errors
- Program compiles and runs
- Output is incorrect
- Caused by incorrect logic
- Not detected by compiler

Errors occur during development phase.

---

## 2.2 Exceptions

Exceptions occur at runtime.

- Caused by invalid user input or unexpected conditions
- Program compiles successfully
- Error occurs during execution
- If not handled → program terminates immediately

### Key Difference

Errors → Developer mistakes  
Exceptions → Runtime problems / Invalid input / Unexpected situations  

---

# 3. Execution Flow When Exception Occurs

Normal Execution:
- Code executes line by line from top to bottom

When Exception Occurs:
1. Exception is thrown
2. Program stops at that line
3. Remaining code is skipped
4. Program terminates

---

# 4. Types of Exceptions in Java

Java exceptions are classified into two major types:

---

# 4.1 Checked Exceptions

- Identified by Java compiler
- Must be handled at compile time
- Compiler forces you to handle them

Examples:
- InterruptedException
- IOException
- FileNotFoundException

Handling Methods:
- try-catch block
- throws keyword

---

# 4.2 Unchecked Exceptions

- Not identified by compiler
- Occur at runtime
- Programmer must identify and handle them

Examples:
- ArithmeticException
- NullPointerException
- ArrayIndexOutOfBoundsException
- NumberFormatException

---

# 5. Common Unchecked Exceptions with Examples

---

## 5.1 ArithmeticException

Occurs when dividing by zero.

```java
int number = 0;
int result = 100 / number;
```

Result:
ArithmeticException: / by zero

---

## 5.2 ArrayIndexOutOfBoundsException

Occurs when accessing invalid index of array.

```java
int[] arr = new int[5];
arr[5] = 10;  // Valid index: 0 to 4
```

---

## 5.3 NumberFormatException

Occurs when converting invalid string to number.

```java
String s = "abc";
int num = Integer.parseInt(s);
```

---

## 5.4 NullPointerException

Occurs when performing operations on null reference.

```java
String s = null;
System.out.println(s.length());
```

Important:
- null means reference does not point to any object
- It is not zero
- It is not empty string

---

# 6. try-catch Block

## Syntax

```java
try {
    // risky code
} catch (ExceptionType e) {
    // handling code
}
```

## How It Works

- Code inside try block executes
- If exception occurs → control moves to catch block
- If no exception → catch block is skipped
- Program continues execution

---

# 7. Handling ArithmeticException Example

```java
try {
    int result = 100 / number;
} catch (ArithmeticException e) {
    System.out.println("Invalid input. Cannot divide by zero.");
}
```

Program will:
- Not terminate
- Continue executing remaining statements

---

# 8. Multiple Catch Blocks

One try block can have multiple catch blocks.

```java
try {
    // risky code
} catch (ArithmeticException e) {
    // handle arithmetic
} catch (NullPointerException e) {
    // handle null
} catch (NumberFormatException e) {
    // handle format
}
```

Rules:
- Only one matching catch block executes
- Others are ignored
- If no match → program terminates

---

# 9. Generic Exception Handling

Instead of multiple catch blocks:

```java
try {
    // risky code
} catch (Exception e) {
    System.out.println(e.getMessage());
}
```

Reason:
- Exception is parent class of all exception classes
- Can handle all types of exceptions

---

# 10. getMessage() Method

```java
e.getMessage();
```

Purpose:
- Returns detailed exception message
- Helps in debugging
- Explains reason for exception

---

# 11. finally Block

## Syntax

```java
try {
    // risky code
} catch (Exception e) {
    // handle
} finally {
    // always executed
}
```

## Key Characteristics

finally block always executes:
- Whether exception occurs
- Whether exception does not occur
- Whether exception is handled
- Whether exception is not handled

---

## Use of finally Block

Commonly used for:
- Closing file connections
- Closing database connections
- Releasing system resources

Example:

```java
try {
    // open file
} catch (Exception e) {
    // handle exception
} finally {
    // close file
}
```

Important Rules:
- catch is mandatory after try
- finally is optional
- finally must come after all catch blocks

---

# 12. Checked Exception Example

## Thread.sleep Example

```java
Thread.sleep(5000);
```

Compiler Error:
Unhandled exception type InterruptedException

---

## Solution 1: Using try-catch

```java
try {
    Thread.sleep(5000);
} catch (InterruptedException e) {
    e.printStackTrace();
}
```

---

## Solution 2: Using throws Keyword

```java
public static void main(String[] args) throws InterruptedException {
    Thread.sleep(5000);
}
```

---

# 13. throws Keyword

- Used at method level
- Declares that method may throw exception
- Mostly used for checked exceptions

Example:

```java
public void methodName() throws IOException {
    // code
}
```

Multiple exceptions:

```java
public void methodName() throws IOException, InterruptedException {
}
```
# Difference Between `throw` and `throws` in Java

---

# 1. Introduction

In Java, `throw` and `throws` are keywords used in exception handling.  
Even though their names look similar, their purpose and usage are completely different.

---

# 2. Definition

## `throw`

- Used to explicitly throw an exception.
- Used inside the method body.
- Used to create and throw a single exception object.
- Transfers control to the nearest matching catch block.

## `throws`

- Used to declare exceptions.
- Used in the method signature.
- Informs the caller that the method may throw exceptions.
- Delegates the responsibility of handling exception to the calling method.

---

# 3. Syntax

## Syntax of `throw`

```java
throw new ExceptionType("Error message");
```

- Must be followed by an object.
- Used inside method body.

---

## Syntax of `throws`

```java
public void methodName() throws ExceptionType {
    // code
}
```

- Used in method declaration.
- Can declare multiple exceptions separated by commas.

---

# 4. Example of `throw`

```java
public class Test {

    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }
}
```

Explanation:

- Exception is manually created using `new`.
- Control immediately transfers to JVM.
- Program stops if not handled.

---

# 5. Example of `throws`

```java
public class Test {

    public static void check() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException {
        check();
    }
}
```

Explanation:

- Method `check()` declares that it may throw `InterruptedException`.
- Responsibility is passed to calling method.
- If not handled, program terminates.

---

# 6. Key Differences

| Feature | `throw` | `throws` |
|----------|----------|----------|
| Type | Statement | Declaration |
| Location | Inside method body | In method signature |
| Purpose | Actually throws exception | Declares exception |
| Responsibility | Immediately transfers control | Delegates to caller |
| Number of Exceptions | Only one at a time | Multiple allowed |
| Used Mostly With | Runtime or custom exceptions | Checked exceptions |

---

# 7. Important Rules

- `throw` is followed by an exception object.
- `throws` is followed by exception class names.
- `throw` can be used for both checked and unchecked exceptions.
- `throws` is mainly used for checked exceptions.
- After `throw`, no code executes unless handled.

---

# 8. Real-Time Scenario Example

## Using `throw`

If a user enters invalid age:

```java
if (age < 18) {
    throw new IllegalArgumentException("Invalid age");
}
```

Application immediately throws exception.

---

## Using `throws`

If a method reads a file:

```java
public void readFile() throws IOException {
    // file reading logic
}
```

Caller must handle or declare the exception.

---

# 9. Interview Quick Summary

- `throw` → Used to explicitly throw an exception.
- `throws` → Used to declare exception in method signature.
- `throw` creates exception object.
- `throws` passes responsibility to caller.
- `throw` is inside method.
- `throws` is part of method declaration.
- `throw` throws one exception at a time.
- `throws` can declare multiple exceptions.

---
---

# 14. try-catch vs throws

| try-catch | throws |
|------------|---------|
| Handles exception locally | Delegates exception to caller |
| Statement level | Method level |
| Used for checked & unchecked | Mostly used for checked |

---

# 15. Real-Time Scenario (Login Example)

Login System:

1. User enters username
2. User enters password
3. If invalid:
   - Application does not crash
   - Error message is displayed
   - User can retry

This is practical use of exception handling.

---

# 16. Checked vs Unchecked Differences

| Checked Exceptions | Unchecked Exceptions |
|--------------------|----------------------|
| Identified by compiler | Not identified by compiler |
| Must be handled | Optional to handle |
| Compile-time checking | Runtime checking |
| Use try-catch or throws | Use try-catch |

---