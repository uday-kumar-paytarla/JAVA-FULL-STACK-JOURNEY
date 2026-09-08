public class Main {

    public static void main(String[] args) {

        Car audicarobj = new Car() {

            @Override
            public void applybreaks() {
                System.out.println("Done!!!");
            }
        };

        audicarobj.applybreaks();
    }
}