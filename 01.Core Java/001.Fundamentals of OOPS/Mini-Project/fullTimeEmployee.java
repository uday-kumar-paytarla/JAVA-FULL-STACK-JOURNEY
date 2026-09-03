public class fullTimeEmployee extends employee {
    private  double baseSalary;
    private double allowances;
    public fullTimeEmployee(int emp_Id,String emp_Name,String emp_Dept, double baseSalary,double allowances){
        super(emp_Id,emp_Name,emp_Dept);
        this.baseSalary = baseSalary;
        this.allowances = allowances;
    }
    @Override 
    public double calculateSalary(){
        return baseSalary + allowances;
    }
    public double getbaseSalary(){
        return baseSalary;
    }
    public double getallowances(){
        return getallowances();
    }
}
