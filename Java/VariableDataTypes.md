## Variables and Data Types

## variable
A variable is a container used to store data in a program. It represents a value. The value stored inside a variable can change, which is why it is called a “variable” (because the value can vary).
Variable.

Example:
int age = 30;
Here, age is the variable and 30 is the value.

## Data Type

A data type defines what type of data a variable can store.
In Java, every variable must be declared with a data type.
The data type must match the value stored.

Examples:
int → whole numbers (int x = 100;)
float → decimal numbers (float price = 100.25f;)
String → text (String name = "John";)

# Format in Java:
dataType variableName = value;

## Data Type in Java

A data type represents the type of data that a variable can store.
Whenever we create a variable in Java, we must specify its data type.
The data type tells the compiler what kind of value the variable will hold.

## Java data types are divided into two main categories:

1.Primitive Data Types
2.Non-Primitive (Derived) Data Types

## Primitive Data Types:

Primitive data types are basic built-in data types used to store simple values.
They are divided as follows:
1.For Whole Numbers (without decimal):
    byte
    short
    int
    long

These are used to store numbers without decimal values.
The choice depends on the size of the number.

2.For Decimal Numbers:
    float
    double

These are used to store numbers with decimal values.
Double is more commonly used because it provides more precision.

3.For Single Character:
    char

Used to store a single character.
Characters must be written inside single quotes.
Example:
char grade = 'A';

4.For True or False:
boolean

Used to store only two values: true or false.
Example:
boolean isActive = true;

## Non-Primitive (Derived) Data Types
Non-primitive data types are more complex and store collections or objects.

Examples:
String
Array
ArrayList
HashMap
HashSet

These are also called:
Derived data types
Reference types
Collections (for some types like ArrayList, HashMap, etc.)

## Difference Between Primitive and Non-Primitive:

Primitive Data Types:
    Store single value at a time.
    Use less memory.
    Start with lowercase.
    Example: int, double, char, boolean

Non-Primitive Data Types:
    Can store multiple values or complex data.
    Use more memory.
    Start with uppercase.
    Example: String, ArrayList, HashMap