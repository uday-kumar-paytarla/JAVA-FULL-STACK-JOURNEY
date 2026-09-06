package bank;
public class balance{
    private void getbalance(){
        System.out.println("this is private cant be accessed");
    }
    public void getcustomerbalance(){
        getbalance(); // the balance is private so accessed in only in the same class.
    }
}