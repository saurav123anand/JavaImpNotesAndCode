package abstractDesignPattern;

public class Client {
    public static void main(String[] args) {
        // I want to get android dev
        Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(employee.name());

        // I want to get web dev
        Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(employee2.name());
    }
}
