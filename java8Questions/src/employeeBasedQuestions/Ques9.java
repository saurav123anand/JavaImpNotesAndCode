package employeeBasedQuestions;

import java.util.Comparator;
import java.util.List;

public class Ques9 {
    // Find the youngest female employee in the organization.
    public Employee findYoungest(List<Employee> employeeList){
        return employeeList.stream().filter(employee -> employee.getGender().equalsIgnoreCase("F"))
                .min(Comparator.comparing(Employee::getAge)).orElse(null);
    }
}
