package employeeBasedQuestions;

import java.util.List;

public class Ques16 {
    // Find all employees who lives in ‘Bengaluru’ city, sort them by their name and return the names of the employees
    public List<String> findNames(List<Employee> employeeList){
        return employeeList.stream().filter(employee -> employee.getCity().equalsIgnoreCase("Bengaluru"))
                .sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
                .map(Employee::getName).toList();
    }
}
