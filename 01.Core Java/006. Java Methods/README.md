# Day 06 - Java Methods

## What is Method?

Method is a set of instructions to perform a task.In otherwords method is collection of instructions to perform a task.

## Declaration of a Method

```java
public int sum (int a, int b){
    //action to perform.
}
```
```
1.public ---> refers to access specifiers.
2.int    ---> return type.
3.sum    ---> name of the method.
4.(int a , int b) ---> Arguments or Parameters.
```

## Types of Access Specifiers
# 1. Public 
A method can be accessed thorugh any class & package.

# 2. Private
A method can be accessed only in the same class.

# 3. Protected
A method can be accessed by other class with the same package and in another package sub-classes can access this method

# 4. Default
A method can be accessed only in class which has same package.

## 2. Return type
# 1.void 
A void is a return type is java which doesn't return anything
# 2. int
An int is a return type in java which return something.
# 3. boolean
A boolean is a return type in java which return only **true** or **false**

## Types of Methods
# 01.System Defined Method
```java
public class Main{
    public static void main(String[]args){
        int a = 36;
        System.out.println(Math.sqrt(a)); // A System-Defined Method 
    }
}
```
# 02. User-Defined Method
```java
public class Main{
    public static void main(Stirng[]args){
        int a = 15;
        int b = 36;
        System.out.println("The sum is "+sum(a,b));
    }
    public int sum(int a, int b){
        return a+b
    }
}
```
# 03.Overridden Method
In a class having more than one method with same name.
```java
public class animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
```
```java 
public class dog extends animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}
```
# 04.Overloaded Method
A method having same name but with different parameters.
```java
public class calculator{
    public int add(int a , int b){
        return a+b;
    }
    public int add(int a , int b , int c){
        return a+b+c;
    }
}
```
# 05.Static Method
A method having static as keyword and these type of methods are associated with class.
```java
public class animal{
    static void sound(){
        System.out.println("Animal makes sound"); //static method

    }
    public void eat(){
        System.out.println("Animal eats") // non- static method
    }
}
```
```java
public class main{
    public static void main(String[]args){
        animal.sound();
        animal dog = new animal();
        dog.eat();
    }
}
```
# 06.Final Method 
A method cannot be overrride.
# 07.Abstract Method
A method which is declared in abstract class with abstract key word and accessed on as object in sub-class.Sub-class takes the responsibility of writing the method body.
# 08.Variables Arguments
For intalizaing more number of parameters the Varibles Arguments is used.
```java
public class calculate{
    public void add(int... number){
        int sum = 0;
        for(int var:number){
            sum+=var;
        }
    }
}
```
## Status

**Day 04 - Non-Primitive Variables - Completed** ✅