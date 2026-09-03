class bank{
    private double balance;
    public bank(double balance){
        this.balance = balance;
    }
    public double getbalance(){
        return balance;
    }
    public void deposti(double amount){
        if(amount <=0){
            System.out.println("Transaction Failed");
        }else{
            balance +=amount;
            System.out.println("Transaction Successfull");
        }
    }
    public void withdraw(double amount){
        if(amount <=balance){
            balance = balance -amount;
            System.out.println("Transaction Successfull");
        }else{
            System.out.println("Insufficent Fund,Transaction Failed");
        }
    }
}