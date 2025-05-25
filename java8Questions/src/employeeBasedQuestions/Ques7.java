package employeeBasedQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ques7 {
    // Find highest salaried employee based on department.
    public Map<String, Optional<Employee>> highestPaid(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
    }
}
