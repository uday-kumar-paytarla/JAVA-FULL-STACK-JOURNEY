## Day-09 Java Generic Classes - Part - 02

## Generic Class in Java
In Java language Generic classes comes into role to avoid the typecast while using object.
Example
```java
public class Person{
    Object name;
    public Object setname(){
return name;
    }
    public void print(Object name){
        this.name = name;
    }
}
public class Main{
    public static void main(String[]args){
        Person obj1 = new Person();
        obj1.print(1);
        Object printvalue = obj1.setname();// intalized the object varibale
        if((int)printvalue == 1){ // need to typecast the varibale to access it.
            System.out.println("ERROR!!");
        }
    }
}
```
## Declaration of Generic Clas
```java
public class  Perosn<P>{
P value;
public P getvalue(){
    return value;
}
public void setvalue(P){
    this.value = value;
}
}

public class Main{
    public static void main(String[]args){
        Person <Integer> obj1 = new Person();
        obj1.setvalue(1);
        Integer printvalue = obj1.getvalue();
        if(printvalue ==1){
            System.out.println("Generic class");
        }
    
    }
}
```
## Inheritacne in Generic Class
Exmaple
```java 
public class Animal <A>{
    A value;
    public void printvalue(A value){
        System.out.println(value);
    }
}
//Generic Super class
public dog extends Animal<String>{
   //we have extended the and intiated the type.
}
//Generic Sub Class
```
**Note: While Inheritancing the generic super class generic sub class there is no mention of data type**

## More than one
Example
```java
public class pairs<K,V>{
    private K key;
    private V value;
    public void getpair(K key, V value){
        this.key = key;
        this.value = value;
        System.out.println("Key: "+key + "Valeu: " + value);
    }
}

public class Main{
    public static void main(String[]args){
        pairs<String,Numver> obj1 = new pairs();
        obj1.getpair("Uday",101);
    }
}
```