package employeeBasedQuestions;

import java.util.List;

public class Ques10 {
    // Find the number of employees in the organisation.
    public long findCount(List<Employee> employeeList){
        return employeeList.stream().count();
    }
}
