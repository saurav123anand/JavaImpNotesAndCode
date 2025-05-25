package employeeBasedQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques15 {
    // Find the names of the departments that have more than three employees
    public List<String> findDepts(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>3)
                .map(Map.Entry::getKey).toList();
    }
}
