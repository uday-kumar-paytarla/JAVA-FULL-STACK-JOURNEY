# Day 01 — Object-Oriented Programming Fundamentals

## Overview

Day 1 of my Java Full Stack Development journey focused on understanding the fundamentals of Object-Oriented Programming (OOP) in Java.

The objective was to build a strong foundation in the core principles of OOP and apply them through practical Java programs.

## Topics Covered

### 1. Classes and Objects

- Understanding classes as blueprints for objects
- Creating and initializing objects
- Defining fields and methods
- Accessing object properties and behaviors

### 2. Encapsulation

- Understanding data hiding
- Using private fields
- Implementing getters and setters
- Controlling access to object data

### 3. Inheritance

- Understanding parent and child classes
- Reusing properties and methods
- Using the `extends` keyword
- Understanding relationships between classes

### 4. Polymorphism

- Understanding compile-time polymorphism
- Method overloading
- Understanding runtime polymorphism
- Method overriding

### 5. Abstraction

- Understanding abstraction
- Abstract classes
- Abstract methods
- Hiding implementation details

## Practical Implementation

The concepts covered during this session were implemented using independent Java programs for:

- Classes and Objects
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
# Mini-Project
## Employee Payroll System 
Employee Payroll System
│
├── Employee.java
├── FullTimeEmployee.java
├── PartTimeEmployee.java
├── ContractEmployee.java
└── Main.java
## Project Overview

Employee Payroll System is a console-based Java application used to manage basic employee information and calculate salaries for different types of employees.

The project is created to practice and understand the core concepts of Object-Oriented Programming in Java.

## Employee Types

The system supports three types of employees:

1. Full-Time Employee
2. Part-Time Employee
3. Contract Employee

## Salary Calculation

Each employee type has a different salary calculation.

### Full-Time Employee

Salary is calculated using:

Base Salary + Allowance

### Part-Time Employee

Salary is calculated using:

Hours Worked × Hourly Rate

### Contract Employee

Salary is calculated using:

Contract Amount

## OOP Concepts Used

### 1. Encapsulation

Employee data is kept private and accessed using methods such as getters and setters.

### 2. Inheritance

Full-Time, Part-Time, and Contract employees inherit common properties and methods from the `Employee` class.

### 3. Abstraction

`Employee` is an abstract class that defines common employee information and the `calculateSalary()` method.

Each child class provides its own implementation of salary calculation.

### 4. Polymorphism

An `Employee` reference can refer to different employee objects.

Example:

```java
Employee employee;

employee = new FullTimeEmployee(...);