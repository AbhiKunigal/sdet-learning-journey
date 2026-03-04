# Java Complete Notes  
(Wrapper Classes, Data Conversion, Packages, and Access Modifiers)

---

# 1. Wrapper Classes

## 1.1 Definition of Wrapper Class

A Wrapper Class is a predefined class in Java that converts a primitive data type into an object.

For every primitive data type, Java provides a corresponding wrapper class.

---

## 1.2 Definition of Primitive Data Type

A Primitive Data Type is a basic data type in Java that stores simple values directly in memory and is not an object.

Examples:
- int
- double
- float
- boolean
- char
- long
- short
- byte

---

## 1.3 Primitive Types and Their Wrapper Classes

| Primitive Type | Wrapper Class |
|---------------|---------------|
| int           | Integer       |
| double        | Double        |
| float         | Float         |
| boolean       | Boolean       |
| char          | Character     |
| long          | Long          |
| short         | Short         |
| byte          | Byte          |

Note:  
String is not a wrapper class because it is not a primitive type.

---

## 1.4 Need for Wrapper Classes

### 1.4.1 Data Conversion

Wrapper classes provide built-in methods to convert data from one type to another.

Examples:
- String to int
- String to double
- Primitive to String

### 1.4.2 Usage in Collections

Collections like ArrayList do not support primitive types. They require objects.

Example:

```java
ArrayList<Integer> list = new ArrayList<>();
```

Primitive types like `int` cannot be used directly in collections.

---

# 2. Data Conversion

## 2.1 String to Primitive Types

### 2.1.1 String to int

Definition:  
`Integer.parseInt()` converts a String into an int.

```java
String s = "10";
int x = Integer.parseInt(s);
```

If the string contains non-numeric characters, it throws NumberFormatException.

---

### 2.1.2 String to double

Definition:  
`Double.parseDouble()` converts a String into a double.

```java
String s = "10.5";
double d = Double.parseDouble(s);
```

---

### 2.1.3 String to boolean

Definition:  
`Boolean.parseBoolean()` converts a String into a boolean.

```java
String s = "true";
boolean b = Boolean.parseBoolean(s);
```

Only "true" (case insensitive) returns true.  
Any other value returns false.

---

### 2.1.4 String to char

Direct conversion from String to char is not supported using wrapper classes.

Reason:
- String may contain multiple characters.
- char stores only one character.

To get a character from String:

```java
String s = "Java";
char ch = s.charAt(0);
```

---

## 2.2 Primitive Types to String

### Definition

`String.valueOf()` converts any primitive data type into a String.

---

### Examples

```java
int x = 10;
String s1 = String.valueOf(x);

double d = 10.5;
String s2 = String.valueOf(d);

char c = 'A';
String s3 = String.valueOf(c);

boolean b = true;
String s4 = String.valueOf(b);
```

Note:  
`valueOf()` is an example of method overloading because it has multiple versions for different data types.

---

## 2.3 Real-Time Use Cases (Automation Testing)

### 2.3.1 Adding Prices from UI

UI data is usually retrieved as String.

```java
String price1 = "150";
String price2 = "200";

int total = Integer.parseInt(price1) + Integer.parseInt(price2);
System.out.println(total);
```

Conversion is required to perform arithmetic operations.

---

### 2.3.2 Sending Numeric Data to Textbox

Textboxes accept only String values.

```java
int phone = 987654321;
String phoneStr = String.valueOf(phone);
```

---

# 3. Packages

## 3.1 Definition of Package

A Package is a namespace used to group related classes and interfaces together.

It helps organize code and avoid naming conflicts.

---

## 3.2 Java Hierarchy

Project  
→ Package  
→ Class  

---

## 3.3 Types of Packages

### 3.3.1 Built-in Package

A Built-in Package is a package provided by Java that contains predefined classes.

Examples:
- java.util
- java.lang

Example:

```java
import java.util.Scanner;
```

---

### 3.3.2 User-Defined Package

A User-Defined Package is created by the programmer to organize classes.

Example:

```java
package day17.pack1;
```

---

## 3.4 Subpackage

A Subpackage is a package created inside another package.

Example:
day17.pack1

---

## 3.5 Import Statement

The `import` statement is used to access classes from another package.

Example:

```java
import java.util.Scanner;
```

Import is required when using classes from external packages.

---

# 4. Access Modifiers

## 4.1 Definition of Access Modifier

An Access Modifier is a keyword that defines the visibility (scope) of variables, methods, and classes.

It controls where members can be accessed.

---

## 4.2 Types of Access Modifiers

- private  
- default  
- protected  
- public  

---

## 4.3 Private

Definition:  
Accessible only within the same class.

```java
private int x;
```

Scope: Class level.

---

## 4.4 Default (No Keyword)

Definition:  
If no access modifier is specified, it is treated as default.

Accessible only within the same package.

```java
int x;   // default access
```

Scope: Package level.

---

## 4.5 Protected

Definition:  
Accessible:
- Within the same package  
- Outside the package through inheritance  

```java
protected int x;
```

Scope: Package + Inheritance.

---

## 4.6 Public

Definition:  
Accessible from anywhere in the project.

```java
public int x;
```

Scope: Project level.

---

## 4.7 Access Modifier Comparison Table

| Modifier   | Same Class | Same Package | Outside Package | Outside via Inheritance |
|------------|------------|--------------|------------------|--------------------------|
| private    | Yes        | No           | No               | No                       |
| default    | Yes        | Yes          | No               | No                       |
| protected  | Yes        | Yes          | No               | Yes                      |
| public     | Yes        | Yes          | Yes              | Yes                      |

---

# 5. Important Interview Points

- Wrapper classes convert primitive types into objects.
- String to primitive conversion uses parse methods.
- Primitive to String conversion uses valueOf().
- Collections require wrapper classes instead of primitive types.
- Default access modifier has no keyword.
- Protected members are accessible outside the package only through inheritance.
- Import is required to access classes from another package.
- String to char conversion uses charAt() method.