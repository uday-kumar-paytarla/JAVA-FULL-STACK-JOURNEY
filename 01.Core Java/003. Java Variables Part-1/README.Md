# Day 03 - Java Variables Part 1

## What is a Variable?

A variable is a container used to store a value.

Example:

int age = 22;

Here:
- int is the data type
- age is the variable name
- 22 is the value


## Static and Strong Typing

Java is a statically typed language because the data type of a variable is known at compile time.

Java is strongly typed because a variable can store only values that are compatible with its declared data type.

Example:

int number = 10;


## Variable Naming Rules

- Java variables are case-sensitive.
- Java keywords cannot be used as variable names.
- Multiple-word variable names generally use camelCase.
- Constants are generally written in uppercase letters.

Example:

int employeeAge;
final int MAX_AGE = 100;


## Primitive Data Types

Java has 8 primitive data types:

1. byte
2. short
3. int
4. long
5. float
6. double
7. char
8. boolean


### byte

Size: 8 bits

Example:

byte age = 25;


### short

Size: 16 bits

Example:

short marks = 500;


### int

Size: 32 bits

Example:

int salary = 50000;


### long

Size: 64 bits

Example:

long number = 100000L;


### float

Size: 32 bits

Example:

float price = 10.5f;


### double

Size: 64 bits

Example:

double salary = 50000.50;


### char

Size: 16 bits

Used to store a single character.

Example:

char grade = 'A';


### boolean

Used to store true or false.

Example:

boolean active = true;


## Type Conversion

Type conversion means converting a value from one data type to another.


### 1. Widening Conversion

Widening conversion means converting a smaller compatible data type into a larger data type.

It happens automatically.

Example:

int number = 10;
double value = number;


### 2. Narrowing Conversion

Narrowing conversion means converting a larger data type into a smaller data type.

It requires explicit casting.

Example:

double number = 10.5;
int value = (int) number;

The fractional part is lost.


### 3. Numeric Promotion

During arithmetic operations, smaller numeric types can be promoted to another numeric type.

Example:

byte a = 10;
byte b = 20;

int result = a + b;


## Types of Variables

There are three important types of variables:

1. Local Variable
2. Instance / Member Variable
3. Static Variable


### 1. Local Variable

A local variable is declared inside a method, constructor, or block.

Example:

void display() {
    int age = 22;
}

The variable age is a local variable.


### 2. Instance / Member Variable

An instance variable is declared inside a class but outside methods and constructors.

Each object has its own copy.

Example:

class Employee {
    String name;
    int age;
}


### 3. Static Variable

A static variable is declared using the static keyword.

It belongs to the class and is shared among objects.

Example:

class Employee {
    static String company = "ABC";
}


## Key Learnings

- A variable is used to store a value.
- Java is statically and strongly typed.
- Java has 8 primitive data types.
- Widening conversion happens automatically.
- Narrowing conversion requires explicit casting.
- Numeric promotion can occur during arithmetic operations.
- Local variables are declared inside methods, constructors, or blocks.
- Instance variables belong to individual objects.
- Static variables belong to the class.


## Status

Day 03 - Completed     