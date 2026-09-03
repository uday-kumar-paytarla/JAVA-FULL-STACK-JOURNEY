public class Main {
    public static void main(String[]args){
        Student EnggStudent  = new Student(); //01.OBJECT CREATION
        EnggStudent.name = "UDAY";
        EnggStudent.age = 21;
        EnggStudent.city = "BANGALORE";
        EnggStudent.rollno = 23;
        EnggStudent.Specialization = "CSE-IOT"; //01.OBJECT CREATED.
        System.out.println("ENGG STUDENT DETAILS");
        System.out.println("NAME: "+EnggStudent.name);
        System.out.println("AGE: "+EnggStudent.age);
        System.out.println("CITY: "+EnggStudent.city);
        System.out.println("ROLL NO: "+EnggStudent.rollno);
        System.out.println("SPECIALIZATION: "+EnggStudent.Specialization);

        Student MedStudent = new Student(); //02.OBJECT CREATION
        MedStudent.name = "BALAJI";
        MedStudent.age = 22;
        MedStudent.city = "CHENNAI"; 
        MedStudent.rollno = 24;
        MedStudent.Specialization = "MBBS"; //02.OBJECT CREATED      
        System.out.println("MED STUDENT DETAILS");
        System.out.println("NAME: "+MedStudent.name);
        System.out.println("AGE: "+MedStudent.age);
        System.out.println("CITY: "+MedStudent.city);
        System.out.println("ROLL NO: "+MedStudent.rollno);
        System.out.println("SPECIALIZATION: "+MedStudent.Specialization);                                 
    }
}