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