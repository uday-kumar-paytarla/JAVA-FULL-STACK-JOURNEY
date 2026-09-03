public class partTimeEmployee extends employee {
    private double hoursWorked;
    private double hourlyRate;

    public partTimeEmployee(int emp_Id,
            String emp_Name,
            String emp_Dept, double hoursWorked, double hourlyRate) {
        super(emp_Id, emp_Name, emp_Dept);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public double gethoursWorked() {
        return hoursWorked;
    }

    public double gethourlyRate() {
        return hourlyRate;
    }
}