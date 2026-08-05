package streams;

import java.util.*;

/*
    You are given N strings. Your task is to use the Java Stream API to filter the strings whose length is divisible by either 3 or 4.

    Input -> "Java",
                "Spring",
                "Boot",
                "React",
                "SQL",
                "AWS",
                "Microservice"

    Output -> Java-Spring-Boot-SQL-AWS-Microservice
 */
public class stringJoinerBasedOnLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Java",
                "Spring",
                "Boot",
                "React",
                "SQL",
                "AWS",
                "Microservice"
        );

        StringJoiner stringJoiner = new StringJoiner("-");

        List<String> namesList = list.stream().filter(s -> s.length() % 3 == 0 || s.length() % 4 == 0)
                .toList();

        for (int i = 0; i < namesList.size(); i++){
            stringJoiner.add(namesList.get(i));
        }

        System.out.println(stringJoiner);
    }
}
