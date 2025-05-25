package employeeBasedQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ques6 {
    // Find highest paid salary Employee in the organisation based on gender.
    public Map<String,
            Optional<Employee>> highestPaid(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
    }

}
