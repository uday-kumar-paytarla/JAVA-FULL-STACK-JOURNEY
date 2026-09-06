## Day-06 Java Construstors

### What is Constructor?
- Constructor is similar to method but it doesnt have return type. 
- It is used to create or intialize an instance / instance varible.

### How Constructor is called?
Let us see with an example
Created a class and constructor in class as animal
```java
public class animal{
    animal(){
        System.out.println("It is a constructor");
    }
}
```
While we create object we use key word **new animal()** this new key will call thw constructor.
```java
public class main{
    public static void main(String[]args){
        animal dog = new animal();
    }
}
```
### Rules of the Constructor
- Constructor name and class name should be same.
- Constructor doesn't return anything.
- Constructor cannot be intitalized as **static , final , abstract**

### Types of Constructors
## 01.Default Constructor
A Constructor which is automatically created by java is called Default Constructor
Let us see through example
A class is created but here we cannot see a constructor.
```java
public class animal{
    public void sound(){
        System.out.println("Animal makes sound");
    }
}
```
After compiling the java file we get a class file which looks like 
```java
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class animal {
   public animal() { // In java class file we can see a constructor
   }

   public void sound() {
      System.out.println("Animal makes sound");
   }
}
```
**animal()** is a default constructor created automatically when we compile the java file by JRE.

## 02. Parametrized Constructor
A Constructor containing the parameters is called Parameterized Constructor.
```java
public class person{
    String name;
    person(String name){ //parameterized constructor.
        System.out.println("Parameterized Constructor.");
    }
}
```
Declration in main file.
```java
public class Main {
    public static void main(String[] args) {
        person p1 = new person("Uday");
    }
}
```
## 03.Constructor Overload
In a class having more than one constructor with the same name and different parameters.
```java
public class bank{
    String name;
    String acc_no;
    int balance;
    bank(int balance){//constructor 01
        
        this.balance = balance;
         System.out.println("this prints the balance: "+balance);
    }
    bank(String name,String acc_no){ //constructor 02
        this.acc_no = acc_no;
        this.name = name;
        System.out.println("this prints the acc_no: "+acc_no + " & " + "name: " + name);
    }

}
```java
public class Main {
    public static void main(String[]args){
        bank c1 = new bank(1500);//parameter is passed
        bank c2 = new bank("Uday", "0724");//parameter is passed
    }
}
```
**Note:Constructor Override is not their.Since,constructor cannot be override.**

## 04 Private Constructor
A Private constructor is type of constructor which can be accessed only in the respective class
```java
public class student{
    private student(){
        System.out.println("It is a private constructor.");

    }
    public static student getInstance(){
        student s1 = new student();
        return s1;

    }
}
```
```java
public class Main {
    public static void main(String[] args) {
         student s1 =  student.getInstance();
    }
}
```
## Chaining of Constructor.
It means calling one constructor form another constructor using **this() & super()**key words.

### Using this()
```java
public class chaining01 {
    int number;
    String name;

    chaining01() {
        this(10);   // calls the constructor below, passing a default number
        
    }

    chaining01(int number) {
        this(number, "default");   // calls the constructor below
        
    }

    chaining01(int number, String name) {
        this.number = number;
        this.name = name;
        
    }
}
```
```java
public class main {
    public static void main(String[] args) {
        
        System.out.println("Creating obj1 using no-arg constructor:");
        chaining01 obj1 = new chaining01();
        System.out.println("Number: " + obj1.number + ", Name: " + obj1.name);
        
        System.out.println();
        
        System.out.println("Creating obj2 using int constructor:");
        chaining01 obj2 = new chaining01(25);
        System.out.println("Number: " + obj2.number + ", Name: " + obj2.name);
        
        System.out.println();
        
        System.out.println("Creating obj3 using full constructor:");
        chaining01 obj3 = new chaining01(50, "Uday");
        System.out.println("Number: " + obj3.number + ", Name: " + obj3.name);
    }
}
```
Output
```
Creating obj1 using no-arg constructor:
Number: 0, Name: unknown

Creating obj2 using int constructor:
Number: 25, Name: unknown

Creating obj3 using full constructor:
Number: 50, Name: Uday
```
### Using super()
```java
public class chaining02 {
    String name;
    int id;
    chaining02(){ //constructor with no args

    }
    chaining02(String name , int id){ // constructor with args
        this.name = name;
        this.id = id;
    }
}
```
```java
public class childerofchaining02 extends chaining02{
    int referal_code;
    childerofchaining02(){

    }
    childerofchaining02(String name,int id,int referal_code){
        super(name,id); //useage of super class();
        this.referal_code = referal_code;
        System.out.println("My name is : "+ name + " with id: " + id + " having a referal code: " + referal_code );
    }
}
```
```java
public class main2 {
    public static void main (String[]args){
        childerofchaining02 obj1 = new childerofchaining02();
        System.out.println("this is no-args constructor");
        childerofchaining02 obj2 = new childerofchaining02("UDAY",724, 0);
        System.out.println("This is the parameterized constructor");
    }
}
```
Output
```
this is no-args constructor
My name is : UDAY with id: 724 having a referal code: 0
This is the parameterized constructor
```
### Questions asked on Constructors
- Why Constructor cannot be final?
```
A constructor cannot be final because the **final** key word is used for not to over-ride the method.But as we know a constructor cannot be override.Hence,using of final keyword doesnt make sense here.
```
- Why Constructor cannot be abstract?
```
A constructor cannot be abstract because the **abstract** key word is used tp create a abstract class and the sub-class takes the responisiblity of creating the methods by inheriting the parent class to child class.So a constructor cannot be inherited
```
-Why constructor cannot be static?
```
A constrcutor cannot be static because **static** key word is used to access the static variables and it is associated with object so a constructor need to access the instance varibles.
```
## Status
**Day-06 Java Constructors - Completed.** 