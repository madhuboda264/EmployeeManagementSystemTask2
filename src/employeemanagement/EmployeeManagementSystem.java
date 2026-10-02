package employeemanagement;

import employeemanagement.dev.Developer;
import employeemanagement.exception.InvalidSalaryException;
import employeemanagement.salary.Bonus;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String... arg) {
        Scanner inp = new Scanner(System.in);
        try {

            System.out.println("Entre Employee ID: ");
            int employeeId = inp.nextInt();
            inp.nextLine();

            System.out.println("Enter Employee Name: ");
            String employeeName = inp.nextLine();

            System.out.println("Enter salary: ");
            double salary = inp.nextDouble();
            inp.nextLine();

            System.out.println("Enter department: ");
            String department = inp.nextLine();

            System.out.println("Enter Programming Language: ");
            String programmingLanguage = inp.nextLine();
            Developer developer = new Developer(
                    employeeId,
                    employeeName,
                    salary,
                    department,
                    programmingLanguage
            );
            developer.displayDeveloper();

            EmployeeType employee = developer;
            employee.calculateWork();

            Bonus bonusEligible = developer;
            bonusEligible.calculateBonus();

       }catch (InvalidSalaryException e){
           System.out.println("Error:"+ e.getMessage());
       }finally {
            inp.close();
        }
    }
}
