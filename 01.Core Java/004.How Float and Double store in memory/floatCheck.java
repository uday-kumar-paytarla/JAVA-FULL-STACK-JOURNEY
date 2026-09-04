public class floatCheck{
    public static void main(String[] args) {
        double total = 0.0;
for (int i = 0; i < 10000; i++) {
    total += 0.1;
}
System.out.println("the double total is "+total);
float total1 = 0.0f;
for (int i = 0; i < 10000; i++) {
    total1 += 0.1f;
}
System.out.println("the actual float total is "+total1);
    }
}