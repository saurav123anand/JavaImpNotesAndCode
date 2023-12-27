package factoryDesignPattern;

public class EmployeeFactory {
    // get the employee
    public static Employee getEmployee(String empType){
        if (empType.trim().equalsIgnoreCase("Android dev")){
            return new AndroidDev();
        }
        else if(empType.trim().equalsIgnoreCase("Web dev")){
            return new WebDev();
        }
        return null;
    }

}
