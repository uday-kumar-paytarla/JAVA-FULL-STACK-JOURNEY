public class Main {
    public static void main(String[] args) {
        String s1 = "Uday";
        String s2 = "Uday";
        // Here Strings are immutable
        // if a string which is created with the same content like s1 and s2
        // they point the same "Uday" in the heap memory
      System.out.println("The reference is same " + (s1 == s2));
        System.out.println("the content is same " + s1.equals(s2));
        String s3 = new String("Uday");
        // here due to the key new the content is same
        // but the refernce it is pointing is different i.e is s3
        System.out.println("the content is same " + s1.equals(s3));
       System.out.println("The reference is same " + (s1 == s3));
    }
}