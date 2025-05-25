package employeeBasedQuestions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ques11 {
    // Sort an Employee List by age and name.
    public List<Employee> sortEmployees(List<Employee> employeeList){
        Comparator<Employee> comparingByAge= Comparator.comparing(Employee::getAge);
        Comparator<Employee> comparingByName=Comparator.comparing(Employee::getName);
        return employeeList.stream().sorted(comparingByAge.thenComparing(comparingByName)).toList();
    }
}
