package employeeBasedQuestions;

import java.util.List;

public class Ques19 {
    // Find if there are any employees from IT Department.
    public boolean find(List<Employee> employeeList){
        return employeeList.stream().anyMatch(employee -> employee.getDeptName().equalsIgnoreCase("IT"));
    }
}
