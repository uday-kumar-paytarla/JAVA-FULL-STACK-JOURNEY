public class chaining01 {
    int number;
    String name;

    chaining01() {
        this(10);   // calls the constructor below, passing a default number
        
    }

    chaining01(int number) {
        this(number, "default");   // calls the constructor below
        
    }

    chaining01(int number, String name) {
        this.number = number;
        this.name = name;
        
    }
}