# Day 06 - Java Variables: Non-Primitive Data Types In Depth

## Reference (Non-Primitive) Data Types in Java

Reference data types store a **reference to an object** rather than directly storing the object's data.

## Types of Reference / Non-Primitive Data Types

The main reference data types covered are:

1. Class
2. String
3. Interface
4. Array

---

# 1. Class

Let's understand references using an example of a class.

```java
public class Employee {
    int empId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
```

Now, to create an object of the `Employee` class:

```java
public class Student {
    public static void main(String args[]) {
        Employee empObject = new Employee();
    }
}
```

The `new` keyword creates an object in **heap memory**, and the reference variable `empObject` refers to that object.

```text
empObject ---- reference ----> Employee Object (Heap Memory)
```

### Important Note

Java is **always pass-by-value**.

When an object is passed to a method, a **copy of the object's reference** is passed.

Reference variables allow us to access and work with objects stored in heap memory.

---

# 2. String

`String` is a reference data type in Java.

## String Immutability

Strings are **immutable** in Java.

This means that once a `String` object is created, its contents cannot be changed.

Example:

```java
String s1 = "hello";
String s2 = "hello";
```

String literals are stored in the **String Pool (String Constant Pool)**, which is part of heap memory.

```text
s1 ---- reference ----\
                       >----> "hello" (String Pool)
s2 ---- reference ----/
```

Since the literal `"hello"` already exists in the String Pool, both `s1` and `s2` can refer to the same pooled `String` object.

## Creating a String Using `new`

We can also explicitly create a `String` object using the `new` keyword.

```java
String s3 = new String("hello");
```

Here, a new `String` object is explicitly created in heap memory.

The literal `"hello"` may also exist separately in the String Pool.

---

# 3. Interface

An interface can also be used as a **reference type**.

Let's create an interface:

```java
public interface Person {
    String profession();
}
```

Now let's create classes that implement the interface.

## Teacher Class

```java
public class Teacher implements Person {

    @Override
    public String profession() {
        return "teaching";
    }
}
```

## Engineer Class

```java
public class Engineer implements Person {

    @Override
    public String profession() {
        return "software engineer";
    }
}
```

Now let's create some objects:

```java
public class Student {

    public static void main(String args[]) {

        Person softwareEngineer = new Engineer();

        Person teacher = new Teacher();

        Teacher teacher1 = new Teacher();

        Engineer softwareEngineer1 = new Engineer();
    }
}
```

Here:

```text
softwareEngineer (Person reference)
        |
        └------> Engineer Object (Heap)


teacher (Person reference)
        |
        └------> Teacher Object (Heap)
```

### Important Points

- An interface reference can refer to an object of a class that implements that interface.
- A class reference can refer to an object of the same class.
- A parent/interface reference can refer to a compatible child/implementing object.
- We cannot directly create an object of an interface.

For example:

```java
Person person = new Person();   // ❌ Invalid
```

An interface cannot be instantiated directly.

---

# 4. Array

An array is an object that stores a **fixed-size sequence of elements of the same type**.

Example:

```java
int[] arr = new int[5];
```

Another valid syntax is:

```java
int arr[] = new int[5];
```

The array object is created in **heap memory**, and `arr` stores a reference to it.

```text
arr ---- reference ----> | 10 | 6 | 10 | 40 | 20 |
                           0    1    2    3    4
```

Values can be assigned using indexes:

```java
arr[0] = 10;
arr[1] = 6;
arr[2] = 10;
arr[3] = 40;
arr[4] = 20;
```

Arrays can be:

- One-Dimensional Arrays (1D)
- Two-Dimensional Arrays (2D)
- Multidimensional Arrays

---

# Wrapper Classes

For every primitive data type in Java, there is a corresponding **Wrapper Class**.

Wrapper classes allow primitive values to be represented as objects.

| Primitive Data Type | Wrapper Class |
|--------------------|---------------|
| `int` | `Integer` |
| `char` | `Character` |
| `short` | `Short` |
| `byte` | `Byte` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `boolean` | `Boolean` |

---

# Why Do We Need Wrapper Classes?

## 1. Collections Work With Objects

Java Collections work with objects/reference types rather than primitive types.

For example:

```java
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(20);
```

We use:

```java
Integer
```

instead of:

```java
int
```

because Collections work with objects.

---

## 2. Utility Methods

Wrapper classes provide useful methods for working with primitive values.

Example:

```java
Integer number = 100;
```

### Important Note

Wrapper objects such as `Integer`, `Double`, `Boolean`, etc. are **immutable**.

Assigning a different value to a wrapper variable does not modify the existing wrapper object.

Instead, the variable refers to another wrapper object/value.

---

# Autoboxing

**Autoboxing** is the automatic conversion of a primitive data type into its corresponding wrapper type.

Example:

```java
int a = 10;

Integer a1 = a;
```

Here:

```text
int ----> Integer
```

Java automatically converts the primitive `int` value into an `Integer`.

---

# Unboxing

**Unboxing** is the automatic conversion of a wrapper type into its corresponding primitive data type.

Example:

```java
Integer x = 20;

int x1 = x;
```

Here:

```text
Integer ----> int
```

Java automatically extracts the primitive value from the wrapper object.

---

# Autoboxing and Unboxing

```text
Primitive Data Type
        |
        | Autoboxing
        ↓
Wrapper Class
        |
        | Unboxing
        ↓
Primitive Data Type
```

Example:

```java
int a = 10;

// Autoboxing
Integer b = a;

// Unboxing
int c = b;
```

---

# Constant Variable

A variable whose value cannot be reassigned after initialization can be created using the `final` keyword.

Example:

```java
static final int VAR = 10;
```

Here:

| Keyword | Meaning |
|---------|---------|
| `static` | The variable belongs to the class rather than individual objects |
| `final` | The variable cannot be reassigned after initialization |

Constants are generally written using **uppercase letters**.

Example:

```java
static final int MAX_SIZE = 10;
```

---

# Quick Summary

| Topic | Description |
|------|-------------|
| Class | A reference variable can refer to an object |
| String | Immutable reference type; literals can be stored in the String Pool |
| Interface | An interface reference can refer to an implementing class object |
| Array | Object containing a fixed-size sequence of elements |
| Wrapper Class | Represents primitive values as objects |
| Autoboxing | Primitive → Wrapper |
| Unboxing | Wrapper → Primitive |
| `final` | Prevents reassignment of a variable |

---

# Key Takeaways

- Non-primitive variables store **references to objects**.
- Objects and arrays are created in **heap memory**.
- Java is **always pass-by-value**.
- Strings are **immutable**.
- String literals can be stored in the **String Pool**.
- Interfaces can be used as reference types.
- Arrays are objects in Java.
- Wrapper classes represent primitive values as objects.
- **Autoboxing** converts primitive → wrapper.
- **Unboxing** converts wrapper → primitive.
- `final` prevents a variable from being reassigned.

---

## Status

**Day 04 - Non-Primitive Variables - Completed** ✅