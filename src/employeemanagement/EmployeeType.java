package employeemanagement;

public abstract class EmployeeType {
    public abstract void calculateWork();
    public void showMessage(){
        System.out.println("Employee is working...........");
    }
}
