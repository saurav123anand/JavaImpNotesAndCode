package abstractDesignPattern;

public class EmployeeFactory {
    // get employee
    public static Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory){
        return employeeAbstractFactory.createEmployee();
    }
}
