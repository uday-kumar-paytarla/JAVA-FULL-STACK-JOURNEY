# Day-7 Java Memory Managment

## How a Program is Stored in Memory.
```java
public class Main{
    public static void main(String[]args){
        int pd = 10;
        String sl_l = "Uday";
        Person p1 = new person();
        memory mobj = new memory();
        memoryobj.memory(person01);
    }
    public class memory(Person pobj){
        String sl_02 = "Uday";
        String sl_03 = new String("Uday");
        Person p2 =  p1();
    }
}
```
```

```
## Types of Memory
There are two types of memory in java language.
### 01. Stack
- Stack is memory which stores the Temporary varibales,Methods,Primitivae Data types and References.
- Each thread of java has its own stack memory.
- In stack memory methods are stored in scope and as soon as the any varibale gets out of scope it is deleted in **LIFO (Last In First Out)** order.
- When a stack goes full the we get an error called **java.lang.stack.overflowerror**.

### Types of References
There are two types of references
### 01. Strong References
An Object having reference is called Strong reference.
### 02. Weak References
An Object having weak referecne is called Weak reference.When Garbage Collector runs the weak reference objects get deleted.
```java
WeakReference<Person> weakpObj = 
                              new WeakReference<>(new Person());
```
### 03. Soft Reference
An object will get deleted only when it is urgent i.e there is no space and java needs a space to complete the task.

## 02.Heap Memory
- It stores the reference objects.

## States of Heap Memory
- 01.Younger Generation
- 02.Older Generation
- 03.Meta Space / Non-Heap
### 01 Younger Generation
- Younger generation has 3 states called **eden,S0,S1**
### 02 Older Generation 
- When even the garbage collector runs the objects which have still reference and holds the reference for very longer period of time will fall into Older Generation.
### 03.Meta-Space
Meta Space will store the class varibales,static variables,constants etc..

## Garbage Collector Alogorithn
### What is Garbage Collector?
A Garbage collector is feature of the java where it automatically delets the objects from the heap memory which are not in use or have not any reference for the stack memory.
- It follows the **Merge & Sweep Algorithm** and **Merge & Sweep Algorithm with Compact Memory**

### Versions of Garbage Collector
- Serial Garbage Collector
- Parallel Garbage Collector
- Concurrent Garbage Collector
- G1 Garbage Collecotr

**NOTE:When Garbage Collector runs the world stops**

## Status
**Day-07 Java Memory Managment - Completed**