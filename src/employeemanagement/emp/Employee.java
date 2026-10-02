package employeemanagement.emp;

import employeemanagement.EmployeeType;
import employeemanagement.exception.InvalidSalaryException;
import employeemanagement.salary.Bonus;

public abstract class Employee extends EmployeeType implements Bonus {
    private int employeeId;
    private String employeeName;
    private double salary;
    private String department;


    protected Employee(int employeeId, String employeeName, double salary, String department) throws InvalidSalaryException {
        if (salary < 0){
            throw new InvalidSalaryException("Salary cannot be negative.....");
        }
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
        this.department=department;
    }

    protected double getSalary() {
        return salary;
    }

    public void displayEmployees(){
        System.out.println("<---------------Employee Details------------------>");
        System.out.println("Emplayee ID: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Department "+department);
    }

}
