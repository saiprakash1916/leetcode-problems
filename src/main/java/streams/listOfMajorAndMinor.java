package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class listOfMajorAndMinor {
    record Users(int id, String name, int age) {

    }

    public static void main(String[] args) {
        List<Users> list = Arrays.asList(
                new Users(1, "Alice", 15),
                new Users(2, "Bob", 21),
                new Users(3, "Charlie", 17),
                new Users(4, "David", 18),
                new Users(5, "Jhon", 23)
        );

        Map<Boolean, List<Users>> result = list.stream()
                .collect(Collectors.partitioningBy(
                        user -> user.age() >= 18
                ));

        System.out.println("Majors: " + result.get(true));
        System.out.println("Minors: " + result.get(false));
    }
}
