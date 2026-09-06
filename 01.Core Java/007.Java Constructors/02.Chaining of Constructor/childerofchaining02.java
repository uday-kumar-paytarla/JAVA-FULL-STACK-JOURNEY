public class childerofchaining02 extends chaining02{
    int referal_code;
    childerofchaining02(){

    }
    childerofchaining02(String name,int id,int referal_code){
        super(name,id); //useage of super class();
        this.referal_code = referal_code;
        System.out.println("My name is : "+ name + " with id: " + id + " having a referal code: " + referal_code );
    }
}
