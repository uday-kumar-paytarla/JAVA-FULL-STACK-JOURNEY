package sales;

public class invoice {
    public  void getinvoice(){ //public as access specifier.
        System.out.println("It is sales package with access modifier public in invoice");
    }
    public void getInvoiceDetails(){
        getinvoice();
    }
}
//Public access specifier means a method can be accessed in any package or 
// in any class.