public class bank{
    String name;
    String acc_no;
    int balance;
    bank(int balance){
        
        this.balance = balance;
         System.out.println("this prints the balance: "+balance);
    }
    bank(String name,String acc_no){
        this.acc_no = acc_no;
        this.name = name;
        System.out.println("this prints the acc_no: "+acc_no + " & " + "name: " + name);
    }

}