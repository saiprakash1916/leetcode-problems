package leetCode.commonQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyCount {
    static void frequencyCountOfWords(String words) {
        Map<String, Long> map = Arrays.stream(words.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));
        System.out.println(map);
    }

    static void frequencyCountOfChar(String words) {
        Map<Character, Long> map = words.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));
        System.out.println(map);
    }

    public static void main(String[] args) {
        String str = "java spring java microservices";
        frequencyCountOfWords(str);
        frequencyCountOfChar(str);
    }
}
