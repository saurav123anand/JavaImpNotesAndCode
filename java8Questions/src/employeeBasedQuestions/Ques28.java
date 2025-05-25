package employeeBasedQuestions;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques28 {
    // Group employees by department and city, then find average salary and max salary in each group.
    public void find(List<Employee> employeeList){
        Map<String, Map<Long, DoubleSummaryStatistics>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.groupingBy(Employee::getSalary, Collectors.summarizingDouble(Employee::getSalary))));
        collect.forEach((dept,stats)->{
            System.out.println("department is "+dept);
            stats.forEach((city,summary)->{
                System.out.println("city is "+city);
                System.out.println("Average salary is "+summary.getAverage());
                System.out.println("Max salary is "+summary.getMax());
            });
        });

    }
}
