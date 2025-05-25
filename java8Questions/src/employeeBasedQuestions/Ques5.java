package employeeBasedQuestions;

import java.util.Comparator;
import java.util.List;

public class Ques5 {
    // Find the highest salary earning employee in the organisation.
    public Employee highestSalary(List<Employee> employeeList){
        return employeeList.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
    }
}
