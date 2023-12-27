package factoryDesignPattern;

public class DevClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Android dev");
        System.out.println(employee.salary());

        Employee employee2 = EmployeeFactory.getEmployee("Web dev");
        System.out.println(employee2.salary());
    }
}
