package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class findingHighestSalaryFromDepartment {
    private final int id;
    private final String department;
    private final double salary;

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public findingHighestSalaryFromDepartment(int id, String department, double salary) {
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + department + " " + salary;
    }
}

class mainMethod {
    public static void main(String[] args) {
        List<findingHighestSalaryFromDepartment> list = List.of(
                new findingHighestSalaryFromDepartment(1, "IT", 20000),
                new findingHighestSalaryFromDepartment(2, "IT", 40000),
                new findingHighestSalaryFromDepartment(3, "NON-IT", 25000),
                new findingHighestSalaryFromDepartment(4, "Electrical", 20000),
                new findingHighestSalaryFromDepartment(5, "Mechanical", 40000)
        );

        list.stream()
                .collect(Collectors.groupingBy(
                        findingHighestSalaryFromDepartment::getDepartment,
                        Collectors.maxBy(Comparator.comparing(
                                findingHighestSalaryFromDepartment::getSalary
                        ))))
                .forEach((dept, emp) -> System.out.println(dept + "-> " + emp.get().getSalary()));


        list.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .max(Comparator.comparing(findingHighestSalaryFromDepartment::getSalary))
                .ifPresent(System.out::println);

        list.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .max(Comparator.comparing(findingHighestSalaryFromDepartment::getSalary))
                .map(findingHighestSalaryFromDepartment::getSalary)
                .ifPresent(System.out::println);
    }
}
