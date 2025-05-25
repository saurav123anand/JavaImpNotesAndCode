package employeeBasedQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques22 {
    // Find average salary of each department.
    public Map<String, Double> averageSalary(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.averagingDouble(Employee::getSalary)));
    }
}
