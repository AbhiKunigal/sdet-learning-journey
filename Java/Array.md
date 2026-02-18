# Java Arrays

## Introduction
An array is a collection of elements of the same data type(homogeneous). Arrays allow you to store multiple values in a single variable.

## Types of Arrays
- **Single-dimensional arrays**: Linear collection of elements
- **Multi-dimensional arrays**: Arrays containing arrays (2D, 3D, etc.)

## Declaration
```java
// Single-dimensional
int[] numbers;
String[] names;

// Multi-dimensional
int[][] matrix;
```

## Initialization & Adding Values
```java
// With size
int[] arr = new int[5];

// With values
int[] arr = {10, 20, 30, 40, 50};

// Add value at index
arr[0] = 10;
```

## Length
```java
int size = arr.length; // Returns number of elements
```

## Key Points
- **Index**: Starts from 0 and ends at length-1
- **Fixed size**: Cannot be resized after creation
- **Type-safe**: All elements must be same type
- **Default values**: Primitives initialized to 0/false; objects to null

