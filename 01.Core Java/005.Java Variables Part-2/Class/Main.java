public class Main {
    public static void main(String[]args){
        notebook mybook = new notebook();
        mybook.owner = "Uday";
        mybook.pages = 100;
        //Here we have created a class with notebook 
        // and also created an object as mybook 
        // now new notebook() will be stored in heap memory
        //the reference for this new notebook()will be mybook
        //owner name as Uday
        //pages as 100
        System.out.println(mybook.owner);
        System.out.println(mybook.pages);
        notebook yourbook = mybook;
        System.out.println(yourbook.owner);
        System.out.println(yourbook.pages);
        //here i created another reference as yourbook which points the new notebook()
        //data in heap memory
        notebook anotherebook = new notebook();
        anotherebook.owner = "Balaji";
        anotherebook.pages = 200;
        System.out.print(anotherebook.owner);
        System.out.print(anotherebook.pages);
        //here with the reference of anotherbook a new object called new notbook() is created
    }
}
