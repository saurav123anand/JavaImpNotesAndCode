package employeeBasedQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques2 {
    // Group the Employees by city.
    public Map<String, List<Employee>> groupEmployeeByCity(List<Employee> employeeList){
        Map<String, List<Employee>> result = employeeList.stream().collect(Collectors.groupingBy(Employee::getCity));
        return result;
    }
}
