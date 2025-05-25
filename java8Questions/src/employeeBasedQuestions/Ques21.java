package employeeBasedQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques21 {
    // Find employees whose age is greater than 32 and less than 32.
    public Map<Boolean, List<Employee>> find(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.partitioningBy(employee->employee.getAge()>32));
    }
}
