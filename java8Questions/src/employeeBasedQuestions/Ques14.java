package employeeBasedQuestions;

import java.util.Comparator;
import java.util.List;

public class Ques14 {
    // Find maximum age of an Employee from Employee List
    public int findMaxAge(List<Employee> employeeList){
        return employeeList.stream().max(Comparator.comparing(Employee::getAge)).get().getAge();
    }
}
