package streams;

import java.util.*;

public class secondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Raj", 20000),
                new Employee("Rahul", 12000),
                new Employee("Sai", 200000),
                new Employee("Prakash", 220000),
                new Employee("Nikhil", 20000)
        );
        double secondHighSalary = employees.stream()
                .map(Employee::salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        employees.stream()
                .filter(e -> e.salary() == secondHighSalary)
                .forEach(e -> System.out.println(e.name() + ":" + e.salary()));

    }
}

record Employee(String name, double salary) {
}
