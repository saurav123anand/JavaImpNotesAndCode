package employeeBasedQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques25 {
    // Find the total salary of the paid in the organization where salary paid > 400
    public long totalSalary(List<Employee> employeeList){
        return employeeList.stream().filter(employee -> employee.getSalary()>400)
                .map(Employee::getSalary).reduce(0L, (a,b)->a+b);
    }
}
