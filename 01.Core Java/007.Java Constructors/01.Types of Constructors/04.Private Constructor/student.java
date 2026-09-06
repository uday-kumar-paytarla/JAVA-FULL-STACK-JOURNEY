public class student{
    private student(){
        System.out.println("It is a private constructor.");

    }
    public static student getInstance(){
        student s1 = new student();
        return s1;

    }
}