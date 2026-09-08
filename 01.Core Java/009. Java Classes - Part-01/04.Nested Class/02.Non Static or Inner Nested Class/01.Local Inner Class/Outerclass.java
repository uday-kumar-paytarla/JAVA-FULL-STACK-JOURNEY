class Outerclass{
    int instancevar = 10;
    static int staticvar = 20;
    public void display(){
        int instancevar2 =30;
    
    class localclass{
        int localclassvar = 40;
        public void print(){
        System.out.println(localclassvar + staticvar + instancevar2 + instancevar);
    };

}
localclass obj1 = new localclass();
        obj1.print();
}
}