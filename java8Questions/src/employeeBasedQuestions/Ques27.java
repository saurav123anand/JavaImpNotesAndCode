package employeeBasedQuestions;

import java.util.List;

public class Ques27 {
    // Find all the employees whose name starts with ‘a’.
    public List<Employee> find(List<Employee> employeeList){
        return employeeList.stream().filter(employee -> employee.getName().startsWith("a")).toList();
    }
}
