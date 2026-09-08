## Day-08 Java Classes Part-01
A Class in blueprint of the object which constists of static and non static varibales and methods.
## Types of Classes
- 01.Concrete Class
- 02.Abstracr Class
- 03.Super & Sub Class
- 04.Nested Class
  01. Static Nested Class
  02. Non Static/Inner Nested Class
      01. Local Inner Class
      02. Member Inner Class
      03. Anonymous Inner Class
## 01. Concrete Class
- A class which can create an instance with **new** keyword is called Concrete Class.
- A concrete class can be implemented through **extends** or **implments** keywords.
- A concrete class can be sub-class of abstract or interface class.
- Access Modifiers:Public,Private,Default.
### Example 01
```java
class concrete_class{
    void display(){
        System.out.println("This is an Concrete Class.")
    }
}
// cocnrete_class
public class Main{
    public static void main(String[]args){
        concrete_class obj1 = new concrete_class(); // creating an object using new key word so the above class is concrete class.
        obj1.display();
    }
}
```
### Example 01
```java
public interface class Animal{
    void sound();
}
public dog implments Animal{
    @Override
    void sound(){
        System.out.println("Bow Bow!!");
    }
} //concrete class.
```
## 02.Abstract Class
- A class which hides its internal implmentation and shows only its important features.
- An abstract class can be created only through **abstract** keyword.
- An abstract class doesn't have instance of this class and methods are implmented by their child classes.
```java
public abstract class Car{
   public abstract void  applybreak(); //abstract methods
    public abstract void applyclutch();
    public int getwheel{
        return 4;//non-abstract method.
    }
}   
                 |
                 |
                 |
                 |
                 |
                 
public abstracrt class luxurycar extends Car
{
public abstract antibreak();//more abstraction in child class.
@Override
public abstract applybreak(){
    System.out.println("Replaced by antibreaksystem")
}
                 |
                 |
                 |
                 |
                 |
}
public class Audi extends luxurycar{
    @Override
    public void applyclutch(){
        System.out.println("applied clutch.");
    }
    @Override
    public void antibreaksystem(){
        System.out.println("Working good");
    }
}
```
## 03.Super & Sub Class
- A class from where child class extend the properties is called Super Class.
- A class which extends the properties of the super class is called Sub Class.
- A class which doesn't extends anything have its own parent class called Object class.
```java
public class objectTest{
    public static void main(String[]args){
        Object obj1 = new Person();
        Object obj2 = new Audi();
    System.out.println(obj1.getClass());
    System.out.println(obj2.getClass());
    }
    public class Audi {
    
    public void applyclutch(){
        System.out.println("applied clutch.");
    }
    public void antibreaksystem(){
        System.out.println("Working good");
    }
}
public class Person{
    public void display(){
        System.out.println("Iam a person");
    }
}
}
//Here we didnt created a Object class but java 
//by default created and Person and Audi Extended it
// Now Person and Audi are Sub Class and Object is Super class.
```
Output
```
Class Person
Class Audi
```
## 04.Nested Class
A class having which in the another class is called Nested Class.
There are Two Types of Nested Class
- Static Nested Class
- Non-Static/Inner Nested Class
### Static Nested Class
An Inner class which is a static class is called Static Nested Class.
- It doesnt have acces to non-static varibales or methods of outer class.
- Its object can be intitated without creating the object of Outer class.
```java
class Outerclass{
    int instancevar = 10;
    static int staticvar = 20;
    static class innerclass{
        public void print(){
        System.out.println( instancevar+ staticvar);
        }//instacne varibale is an error.
    }
}
public class Main{
    public static void main(String[]args){
        Outerclass.innerclass innerobj = new Outerclass.innerclass();
        innerobj.print();// created the object of inner class without creating the object of the outerclass.
    }
}
```
They can be created with another access modifiers also like private to access this we have to create an object within method of inner class 
## Non-Static/ Inner Nested Classes
Non-Static nested classes are of three types
- 1 Local Inner Class
- 2 Member Inner Class
- 3 Anonymous Inner Class

## 1.Local Inner Class
The Variables of the local inner class can invoked in the same class as soon as the scope of block ends ends scope also ends
```java
class outerclass{
    int instancevar = 10;
    static int staticvar = 20;
    public void display(){
        int instancevar2 =30;
    
   class Outerclass{
    int instancevar = 10;
    static int staticvar = 20;
    public void display(){
        int instancevar2 =30;
    
    class localclass{
        int localclassvar = 40;
        public void print(){
        System.out.println(localclassvar + staticvar + instancevar2 + instancevar);
    };

}
localclass obj1 = new localclass();
        obj1.print(); //created inside the  outerclass.
}
}


public class Main{
    public static void main(String[]args){
    Outerclass obj = new Outerclass();
        obj.display();;
    }
}
``` 
##  02 Member Inner Class
A class within the another class is called Member Inner Class.
```java
class Outerclass{
    int var = 1;
    class innerclass{
        void print(){
            System.out.println("It is an inner class");
        }
    }
}

public class main{
    public static void main(String[]args){
        Outerclass.innerclass obj1 = new Outerclass. new innerclass();
        obj1.print();
    }
}
```
## 03.Anonymous Inner Class
A class which doesn't need another sub-class to override the methods.
```java
public abstract class Car{
    public abstract void applybreaks();
}
public class Main {

    public static void main(String[] args) {

        Car audicarobj = new Car() {

            @Override
            public void applybreaks() {
                System.out.println("Done!!!");
            }
        };

        audicarobj.applybreaks();
    }
}
``` 
In class file an subclass will be created which extends the abstract class.

### Where do we use this?
If a classA() is to inherit only a single classB() then we use the Nested Classes.

**Note:Inheritance is possible among the inner classes.**

## Status 
Day-08 Java Classes Part-1 - Completed.