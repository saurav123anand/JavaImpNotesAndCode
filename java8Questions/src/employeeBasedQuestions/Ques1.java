package employeeBasedQuestions;

import java.util.Comparator;
import java.util.List;

public class Ques1 {
    // Find oldest Employee by age from the Employee List.
    public Employee findOldest(List<Employee> empList) {
        return empList.stream().max(Comparator.comparing(Employee::getAge)).orElse(null);
    }
}
