package employeeBasedQuestions;

import java.util.List;

public class Ques3 {
    // find  names of all the departments in the organization.
    public List<String> findAllDepts(List<Employee> employeeList){
        return employeeList.stream().map(emp->emp.getDeptName()).distinct().toList();
    }
}
