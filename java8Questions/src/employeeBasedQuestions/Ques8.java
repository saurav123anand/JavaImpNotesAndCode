package employeeBasedQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques8 {
    // Find second highest paid salary Employee based on department.
    public Map<String, Employee> highestPaid(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.collectingAndThen(Collectors.toList(),
                        list->list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).
                                skip(1).findFirst().orElse(null))));

    }

}
