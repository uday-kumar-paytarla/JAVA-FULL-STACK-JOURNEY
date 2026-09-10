public class Main {
    public static void main(String[] args) {
       for(Enumsample sample : Enumsample.values()){
System.out.println(sample.ordinal());
       }
       Enumsample enumvaribale = Enumsample.valueOf("FRIDAY");
       System.out.println(enumvaribale.name());
    }
}
