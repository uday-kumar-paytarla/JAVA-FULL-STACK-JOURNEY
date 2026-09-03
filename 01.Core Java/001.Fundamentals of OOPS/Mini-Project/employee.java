public abstract class employee {

    private int emp_Id;
    private String emp_Name;
    private String emp_Dept;

    public employee(int emp_Id, String emp_Name, String emp_Dept) {
        this.emp_Id = emp_Id;
        this.emp_Name = emp_Name;
        this.emp_Dept = emp_Dept;
    }

    public int getemp_Id() {
        return emp_Id;
    }

    public String getemp_Name() {
        return emp_Name;
    }

    public String getemp_Dept() {
        return emp_Dept;
    }

    public void setemp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public void setemp_Dept(String emp_Dept) {
        this.emp_Dept = emp_Dept;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + emp_Id);
        System.out.println("Employee Name: " + emp_Name);
        System.out.println("Employee Department: " + emp_Dept);
    }

    public abstract double calculateSalary();
}