package employeeBasedQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques12 {
    //  Find Average age of Male and Female Employees.
   public Map<String, Double> averageAge(List<Employee> employeeList){
       return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
   }
}
