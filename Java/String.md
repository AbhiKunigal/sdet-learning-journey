# Java Strings

## Introduction
String is predefined class.
A String is an immutable sequence of characters. In Java, strings are objects created from the `String` class. They are widely used for storing and manipulating text data.

## Declaration & Initialization
```java
// Literal
String str1 = "Hello";

// Using new keyword
String str2 = new String("Hello");

// Empty string
String str3 = "";

// Using char array
char[] chArray = {'H', 'e', 'l', 'l', 'o'};
String str4 = new String(chArray);
```

## String Immutability
// Original value of the string can be changed in mutable but cannot be changed in immutable

- Strings are **immutable** - once created, they cannot be changed
- Any modification creates a new String object
- Original string remains unchanged

```java
String str = "Hello";
str.concat(" World"); // Returns new string, doesn't modify original
System.out.println(str); // Output: Hello

String str2 = str.concat(" World");
System.out.println(str2); // Output: Hello World
```

## Length
```java
String str = "Hello";
int length = str.length(); // Returns 5
```

## Common String Methods
```java
String str = "Hello World";

// Case conversion
str.toUpperCase();     // HELLO WORLD
str.toLowerCase();     // hello world

// Character access
char ch = str.charAt(0);       // H
int index = str.indexOf('o');  // 4
int lastIndex = str.lastIndexOf('o'); // 7

// Substrings
String sub = str.substring(0, 5);  // Hello
String sub2 = str.substring(6);    // World

// Trim whitespace
String str2 = "  Hello  ";
str2.trim(); // Hello

// Replace
str.replace('l', 'x');  // Hexxo Worxd
str.replaceAll("o", "0"); // Hell0 W0rld

// Split
String[] parts = str.split(" "); // [Hello, World]
System.out.println(java.util.Arrays.toString(parts)); // [Hello, World]

// Contains
boolean has = str.contains("World"); // true

// Starts/Ends with
str.startsWith("Hello"); // true
str.endsWith("World");   // true
```

## String Comparison
```java
String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello");
String str4 = s3;

// Compare references (== operator) is used to cmpare the objects
str1 == str2;  // true (same reference in pool)
str1 == str3;  // false (different objects)

// Compare content (equals method) is used compare the values
str1.equals(str2);           // true
str1.equals(str3);           // true
str1.equalsIgnoreCase(str2); // true (ignores case)
str3==str4;                  //true

// Comparison (returns int)
str1.compareTo(str2);   // 0 (equal)
str1.compareTo("Apple"); // positive (str1 > "Apple")
```

## String Concatenation
```java
// Using + operator
String result = "Hello" + " " + "World"; // Hello World

// Using concat method
String result2 = "Hello".concat(" World"); // Hello World

// Using StringBuilder (efficient for multiple concatenations)
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");
String result3 = sb.toString(); // Hello World
```

## String Manipulation
```java
String str = "Hello World";

// Convert to char array
char[] charArray = str.toCharArray();

// Convert number to string
String numStr = String.valueOf(42);

// Format strings
String formatted = String.format("Name: %s, Age: %d", "John", 25);

// Repeat (Java 11+)
String repeated = "ab".repeat(3); // ababab
```

## StringBuffer vs StringBuilder vs String

| Aspect | String | StringBuffer | StringBuilder |
|--------|--------|--------------|---------------|
| Immutable | Yes | No | No |
| Thread-safe | Yes | Yes (Synchronized) | No |
| Performance | Slow (for multiple modifications) | Slower | Fastest |
| Use Case | General use | Multi-threaded | Single-threaded |

```java
// String (creates multiple objects)
String str = "a";
str += "b"; // New object created
str += "c"; // Another new object created

// StringBuilder (more efficient)
StringBuilder sb = new StringBuilder();
sb.append("a");
sb.append("b");
sb.append("c");
String result = sb.toString(); // Only one String object created
```

## String Pool
- Java maintains a **String Pool** for string literals
- If a string literal already exists in the pool, no new object is created
- Using `new String()` always creates a new object outside the pool

```java
String str1 = "Hello"; // Created in pool
String str2 = "Hello"; // Points to same object in pool
String str3 = new String("Hello"); // Created in heap

str1 == str2;  // true (same reference)
str1 == str3;  // false (different objects)
str1.equals(str3); // true (same content)
```

## Key Points
- **Immutability**: Strings cannot be modified after creation
- **Use equals() for comparison**: Don't use == for content comparison
- **String Pool**: Literals are stored in a pool for efficiency
- **Use StringBuilder**: For multiple string concatenations in loops
- **Thread-safety**: Use StringBuffer in multi-threaded environments
- **Null checks**: Always handle null strings to avoid NullPointerException
- **Performance**: Be cautious with + operator in loops; use StringBuilder instead
