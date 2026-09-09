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