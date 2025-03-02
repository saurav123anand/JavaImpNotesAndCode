package employeeBasedQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

        // 1. Group the Employees by city.
//        Map<String, List<Employee>> collect =empList.stream().collect(Collectors.groupingBy(Employee::getCity));
//        System.out.println(collect);

        // 2. Find the count of male and female employees present in the organization.
//        Map<String, Long> collect = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println(collect);

        // 3. Print the names of all departments in the organization.
//        List<String> list = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName))
//                .entrySet().stream()
//                .map(entry -> entry.getKey())
//                .toList();
//        System.out.println(list);

        // second way
//        List<String> distinct = empList.stream().map(employee -> employee.getDeptName()).distinct().toList();
//        System.out.println(distinct);

        // 4. Find maximum age of employee
//        Integer maxAge = empList.stream().map(emp -> emp.getAge()).max(Comparator.naturalOrder()).get();
//        System.out.println(maxAge);

        // 5. Print Average age of Male and Female Employees.
//        Map<String, Double> collect = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//        System.out.println(collect);

        // 6. Find oldest employee.
//        Employee employee = empList.stream().sorted((e1, e2) -> Integer.compare(e2.getAge(), e1.getAge()))
//                .limit(1).findFirst().orElse(null);
//        System.out.println(employee);

        // 7. Find the youngest female employee.
//        Employee youngestFemale = empList.stream().filter(e -> e.getGender().equalsIgnoreCase("F"))
//                .min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
//                .get();
//        System.out.println(youngestFemale);

        // 8. Find the department name which has the highest number of employees.
        Map.Entry<String, Long> stringLongEntry = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry.getKey());
    }
}
