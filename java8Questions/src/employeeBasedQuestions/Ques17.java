package employeeBasedQuestions;

import java.util.Comparator;
import java.util.List;

public class Ques17 {
    // Find Highest experienced employee in the organization.
    public Employee findHighest(List<Employee> employeeList){
        return employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).orElse(null);
    }
}
