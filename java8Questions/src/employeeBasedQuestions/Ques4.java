package employeeBasedQuestions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques4 {
//    Sort the employees by salary in each department in ascending order
    public Map<String, List<Employee>>  sortEmployees(List<Employee> employeeList){
        Map<String, List<Employee>> result = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.collectingAndThen(Collectors.toList(),
                        list -> list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList())));
        return result;
    }
}
