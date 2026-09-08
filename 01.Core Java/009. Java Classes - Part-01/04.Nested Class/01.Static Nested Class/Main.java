public class Main{
    public static void main(String[]args){
        Outerclass.innerclass innerobj = new Outerclass.innerclass();
        innerobj.print(); // created the object of inner class without creating the object of the outerclass.
    }
}