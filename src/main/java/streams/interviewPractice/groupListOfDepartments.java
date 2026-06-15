package streams.interviewPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupListOfDepartments {
    private final String name;
    private final String department;

    public groupListOfDepartments(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        List<groupListOfDepartments> employees = List.of(
                new groupListOfDepartments("Alice", "Engineering"),
                new groupListOfDepartments("Bob", "Marking"),
                new groupListOfDepartments("Charlie", "Engineering"),
                new groupListOfDepartments("David", "Marking"),
                new groupListOfDepartments("Eve", "Engineering")
        );
        Map<String, List<groupListOfDepartments>> result = employees.stream()
                .collect(Collectors.groupingBy(groupListOfDepartments::getDepartment));

        System.out.println(result);
    }
}
