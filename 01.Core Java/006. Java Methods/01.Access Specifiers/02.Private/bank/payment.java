package bank;
import bank.balance;
public class payment {
    public void getbalanceafterpayment(){
   balance b1 = new balance();
   b1.getbalance(); // the getbalance() method is not accessed in another package becuase the access specifier is private.

    }
}
