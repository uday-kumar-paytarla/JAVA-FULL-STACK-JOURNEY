public class contractor extends employee {
    private double contractAmount;

    public contractor(int emp_Id, String emp_Name, String emp_Dept, double contractAmount) {
        super(emp_Id, emp_Name, emp_Dept);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }

    public double getcontractAmount() {
        return contractAmount;
    }
}
