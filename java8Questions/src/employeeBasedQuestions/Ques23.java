package employeeBasedQuestions;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques23 {
    // Find the number of Male and Female in each department.
    public Map<String, Map<String, Long>> findCount(List<Employee> employeeList){
       return employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
               Collectors.groupingBy(Employee::getGender,Collectors.counting())));
    }
}
