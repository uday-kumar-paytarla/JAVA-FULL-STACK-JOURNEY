public class addition{
    public void add(int... number){
        int sum = 0;
        for(int var : number){
sum+=var;
        }
        System.out.println(sum);
    }
}