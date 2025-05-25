package employeeBasedQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class Ques13 {
    // Find the department name which has the highest number of employees.
    public Map.Entry<String, Long>  findHighest(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
    }
}
