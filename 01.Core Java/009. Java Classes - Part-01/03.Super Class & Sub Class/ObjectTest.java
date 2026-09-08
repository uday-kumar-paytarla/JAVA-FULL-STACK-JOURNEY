public class ObjectTest{
    public static void main(String[]args){
        Object obj1 = new Person();
        Object obj2 = new Audi();
    System.out.println(obj1.getClass());
    System.out.println(obj2.getClass());
    }
}
//Here we didnt created a Object class but java 
//by default created and Person and Audi Extended it
// Now Person and Audi are Sub Class and Object is Super class.