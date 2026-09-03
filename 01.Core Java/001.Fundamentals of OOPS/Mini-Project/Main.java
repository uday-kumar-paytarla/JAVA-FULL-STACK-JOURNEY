import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Employee Payroll System==========");
        System.out.println("Enter the Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Employee Name: ");
        String emp_Name = sc.nextLine();
        System.out.println("Enter the Employee Department: ");
        String emp_Dept = sc.nextLine();
        System.out.println("\n Select Employee Type");
        System.out.println("1.Full-Time Employee");
        System.out.println("2.Part-Time Employee");
        System.out.println("3.Contractor");
        System.out.println("Enter your Choice: ");
        int choice = sc.nextInt();
        employee employee;
        switch (choice) {
            case 1:
                System.out.println("Enter the BaseSalary: ");
                double baseSalary = sc.nextDouble();
                System.out.println("Enter the Allowances: ");
                double allowances = sc.nextDouble();
                employee = new fullTimeEmployee(id, emp_Name, emp_Dept, baseSalary, allowances);
                break;
            case 2:
                System.out.println("Enter the Hours-Worked: ");
                double hoursWorked = sc.nextDouble();
                System.out.println("Enter the HourlyRate: ");
                double hourlyRate = sc.nextDouble();
                employee = new partTimeEmployee(id, emp_Name, emp_Dept, hoursWorked, hourlyRate);
                break;
            case 3:
                System.out.println("Enter the Contractor Amount: ");
                double contractorAmount = sc.nextDouble();
                employee = new contractor(id, emp_Name, emp_Dept, contractorAmount);
                break;

            default:
                System.out.print("Invalid Employee Type!!!");
                sc.close();
                return;
        }

        System.out.println("============EMPLOYEE DETAILS==============");
        employee.displayDetails();
        System.out.println("Employee Type : " + employee.getClass().getSimpleName());
        System.out.println("Salary : " + employee.calculateSalary());
        System.out.println("====================================");
        sc.close();

    }
}
