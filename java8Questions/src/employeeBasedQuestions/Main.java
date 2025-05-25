package employeeBasedQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(19, "def", 32, 646, "M", "IT", "Bengaluru", 2011, 14, "Manager"));
        empList.add(new Employee(11, "kyl", 33, 433, "M", "HR", "Hyderabad", 2022, 3, "Manager"));
        empList.add(new Employee(12, "gfh", 34, 120, "F", "Sales", "Bengaluru", 2017, 8, "Sales"));
        empList.add(new Employee(13, "whj", 35, 323, "M", "HR", "Chennai", 2013, 12, "HR"));
        empList.add(new Employee(14, "wej", 36, 233, "M", "HR", "Coimbatore", 2014, 11, "HR"));

        empList.add(new Employee(5, "web", 21, 323, "M", "IT", "Pune", 2011, 14, "SDE-3"));
        empList.add(new Employee(3, "fbw", 20, 890, "M", "IT", "Trivandam", 2022,3, "SDE-2"));
        empList.add(new Employee(2, "weh", 22, 322, "F", "IT", "Pune", 2016, 9, "SDE-3"));
        empList.add(new Employee(19, "ehw", 28, 222, "F", "IT", "Trivandam", 2011,14,"DevOps Engineer"));
    }
}
