## Day-10 Java Classes - Part-03

## 01.POJO Class
A POJO class is a simple class.POJO means **Plan Old Java Object** here old java refers to 
- A class with varibales and getters & setters methods.
- The access modifier must be **public**.
- It has default constructor.
- Class which has no annotations.
- A class which is not extended or implmented
```java
public class person{
    int value;
    private String name;
    public void getintvalue(int value){
        System.out.println(value);
    }
    public void getname(String name){
        System.out.println(name);
    }
    public void setname(String name){
        this.name = name;
    }
}
//POJO Class with public access modifier and getter & setters.
``` 
**Note:The POJO Classes are used when the request comes to our system from the client instead of using the main class we will use the POJO classes to map in components.**
## 02.ENUM Class
An ENUM class is a collection of Constants.
- An enum class is cannot be extended or implmented because it is by default extended by **java.lang.enum**
- An enum class can implment the interfaces.
- enum classes cannot be intalized since the constructor is private.
- An enum class can be abstract.
```java
public enum Enumsample{
    // enum word will make the class enum.
} 
```
## 01.Noraml Enum Class
A Normal Enum Class extends the java.lang.enum.
01. value() : gives them in array
02. ordinal() : a value assigned to the object.
03. valueof() : return the object.
04. name() : return the name.
```java
public enum Enumsample {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}
// it is an enum class.
```
```java
public class Main {
    public static void main(String[] args) {
       for(Enumsample sample : Enumsample.values())//stores the objects in an array form. 
       {
System.out.println(sample.ordinal());// values assigned to the object.
       }
       Enumsample enumvaribale = Enumsample.valueOf("FRIDAY");// return the object
       System.out.println(enumvaribale.name());// return the name.
    }
}
```
## 02.ENUM Class with Custom Values
We can custom the objects value 
```java
public enum Enumsample {
    MONDAY(101, "It is the 1st day of the week."),
    TUESDAY(102, "It is the 2nd day of the week"),
    WEDNESDAY(103, "It is the 3rd day of the week"),
    THURSDAY(104, "It is the 4th day of the week"),
    FRIDAY(105, "It is the 5th day of the week"),
    SATURDAY(106, "It is the 6th day of the week"),
    SUNDAY(107, "It is the 7th day of the week");

    private int value;
    private String name;

    Enumsample(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getval() {
        return value;
    }

    public String getname() {
        return name;
    }
    public static Enumsample getenumvalue (int val){
        for(Enumsample sample : Enumsample.values()){
            if(sample.getval() == val){
                return sample;
            }
        }
        return null;
    }
}
```
## Override in Enum Class through Constants
```java
public enum Enumsampleoverride{
    MONDAY{
        @Override 
        public void print(){
            System.out.println("this  is an override method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public void print(){
        System.out.println("This method applies for all the objects.");
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Enumsampleoverride sample = Enumsampleoverride.SATURDAY;
        sample.print();
        Enumsampleoverride sample2 = Enumsampleoverride.MONDAY;
        sample2.print();
    }
}
```
## 01.Abstract Enum Classes
In Abstract enum class every object must and should override the abstract method.
```java
public enum Enumsample{
    MONDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    },
    TUESDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    },
    WEDNESDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    },
    THURSDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    },
    FRIDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    },
    SATURDAY{
        @Override
        public void printmethod(){
            System.out.println("It is an abstract method");
        }
    };
    public abstract void printmethod();

}
```
## 02.Interface Enum Classes
```java
public enum Enumsample implements MyInterface{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    @Override 
    public String toLowerCase(){
        return this.name().toLowerCase();
    }
}
```
## Final Class
- Final Class is a class which doesn't get Inherited.
```java
public final class finalclasses{

}
public class finalone extends **finalclasses**{

}
```
Here the finalclasses is an error means we cannot inherit

## Status 
**Day - 10 Java Classes - Part- 03 - Completed**