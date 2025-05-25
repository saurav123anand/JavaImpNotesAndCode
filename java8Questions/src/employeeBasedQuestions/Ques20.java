package employeeBasedQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class Ques20 {
    //  Find average and total salary of the organization.
    public List<Double> averageAndTotalSalary(List<Employee> employeeList){
        double sum = employeeList.stream().mapToDouble(Employee::getSalary).sum();
        double average = employeeList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        return List.of(sum,average);

    }
}
