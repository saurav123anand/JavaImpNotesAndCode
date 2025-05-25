package employeeBasedQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques18 {
    //  Find the count of male and female employees present in the organization.
    public Map<String, Long> findCount(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    }
}
