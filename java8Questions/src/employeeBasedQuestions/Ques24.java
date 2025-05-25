package employeeBasedQuestions;

import java.util.Comparator;
import java.util.List;

public class Ques24 {
    // Find the nth Highest salary of the organization
    public long nthHighestSalary(List<Employee> employeeList,int n){
        return employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(n-1).findFirst().get().getSalary();
    }
}
