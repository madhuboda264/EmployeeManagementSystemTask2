package employeemanagement.dev;

import employeemanagement.salary.Bonus;
import employeemanagement.emp.Employee;
import employeemanagement.exception.InvalidSalaryException;

public class Developer extends Employee implements Bonus {
    private String programmingLanguge;
    public Developer(int employeeId, String employeeName,double salary,String department,String programmingLanguge)throws InvalidSalaryException {
        super(employeeId,employeeName,salary,department);
        this.programmingLanguge=programmingLanguge;
    }
    @Override
    public void calculateBonus(double sal) {
        System.out.println("Developer Bonus ="+ (sal*0.10));
    }
    public void calculateWork(){
        System.out.println("Developer is writing and maintaining code.");
    }
    public void displayDeveloper(){
        displayEmployees();
        System.out.println("Programming language "+programmingLanguge);
    }

}
