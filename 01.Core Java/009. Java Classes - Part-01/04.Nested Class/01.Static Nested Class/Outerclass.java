class Outerclass{
    int instancevar = 10;
    static int staticvar = 20;
    static class innerclass{
        public void print(){
        System.out.println( /*instancevar*/+ staticvar);//instacne varibale is an error.
    }
}
}