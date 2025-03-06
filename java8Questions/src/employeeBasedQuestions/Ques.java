package employeeBasedQuestions;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Ques {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));

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
//        Map.Entry<String, Long> stringLongEntry = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
//                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
//        System.out.println(stringLongEntry.getKey());

        // 9. Find if there are any employees from HR Department.

//        Optional<Employee> hr = empList.stream().filter(employee -> employee.getDeptName().equalsIgnoreCase("HR"))
//                .findAny();
//        hr.ifPresent(System.out::println);

        // 10. Find the department names that these employees work for, where the number of
        // employees in the department is over 3.
//        List<String> ans = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
//                .entrySet().stream()
//                .filter(entr -> entr.getValue() > 3)
//                .map(Map.Entry::getKey)
//                .toList();
//        System.out.println(ans);

        // 11. Find all employees who lives in ‘Blore’ city, sort them by their name and print the
        // names of employees.
//        List<Employee> employees = empList.stream().filter(employee -> employee.getCity().
//                        equalsIgnoreCase("Blore"))
//                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
//                .toList();
//        System.out.println(employees);

        // 12.  No of employees in the organisation.
//        long count = empList.stream().count();
//        System.out.println(count);

        // 13. Sorting a Stream by age and name fields.

        // meth 1
//        System.out.println("Sorting based on name and age:: ");
//        Comparator<Employee> comparator1 = Comparator.comparing(Employee::getName);
//        Comparator<Employee> comparator2 = Comparator.comparingInt(Employee::getAge);
//        empList.stream().sorted(comparator1.thenComparing(comparator2)).forEach(employee -> System.out.print(employee.getName()+" "));
//        System.out.println();
//        // meth 2
//        empList.stream().sorted(Comparator.comparing(Employee::getAge))
//                .sorted(Comparator.comparing(Employee::getName))
//                .forEach(employee -> System.out.print(employee.getName()+" "));

        // 14. Highest experienced employees in the organization.
//        Employee employee = empList.stream().min(Comparator.comparing(Employee::getYearOfJoining))
//                        .get();
//        System.out.println(employee);

        // 15. Print average and total salary of the organization.
//        double sum = empList.stream().mapToDouble(Employee::getSalary).sum();
//        Double average = empList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
//        System.out.println(sum);
//        System.out.println(average);

        // 16. Find Highest salary in the organisation.
//        Employee employee = empList.stream().max(Comparator.comparingDouble(Employee::getSalary))
//                .get();
//        System.out.println(employee);

        // 17. Find highest paid salary in the organisation based on gender.
//        Map<String, Optional<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getGender,
//                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
//        System.out.println(collect);

        // meth 2
//        Map<String, Optional<Employee>> highestPaidMFEmployee = empList.stream().collect(Collectors.groupingBy(Employee::getGender,
//                Collectors.
//                        maxBy((t1, t2) ->
//                                Long.compare(t1.getSalary(),t2.getSalary()))));
//        System.out.println(highestPaidMFEmployee);

        // 18. Highest salary based on department.
//        Map<String, Optional<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
//                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
//        collect.entrySet().forEach(entry-> System.out.println(entry.getValue().get()));

        // 19. Print list of employee’s second highest record based on department
//        Map<String, Optional<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
//                Collectors.collectingAndThen(Collectors.toList(),
//                        list -> list.stream().sorted(Comparator
//                                .comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst())));
//        collect.forEach((key,val)-> System.out.println(val.get()));

        // 20. Sort the employees salary in each department in ascending order
//        Map<String, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy
//                (Employee::getDeptName,
//                        Collectors.collectingAndThen(Collectors.toList(),
//                                list -> list.stream()
//                                        .sorted(Comparator.comparing(Employee::getSalary)).toList())));
//        collect.forEach((key,val)-> System.out.println(key+":" +val));


    }
}
