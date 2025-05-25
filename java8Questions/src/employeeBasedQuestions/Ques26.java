package employeeBasedQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques26 {

    // Find a list of employees from each department whose salary is higher than the average salary of that department.
    public List<Employee> find(List<Employee> employeeList){
        Map<String, List<Employee>> groupedByDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName));

        // Filter employees whose salary > average salary of their department
        List<Employee> result = groupedByDept.entrySet().stream()
                .flatMap(entry -> {
                    List<Employee> empList = entry.getValue();
                    double averageSalary = empList.stream()
                            .mapToDouble(Employee::getSalary)
                            .average()
                            .orElse(0.0);
                    return empList.stream()
                            .filter(e -> e.getSalary() > averageSalary);
                })
                .collect(Collectors.toList());
        return result;
    }
}
