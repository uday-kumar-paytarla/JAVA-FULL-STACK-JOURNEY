public class Main {
    public static void main(String[] args) {
        int a =151;
        int b = 12;
        System.out.println("It is  a static method "+addition.getsum(a,b));
        addition s1 = new addition();
         System.out.println("It is a non-static method "+s1.sum(a, b));
        
    }
}
