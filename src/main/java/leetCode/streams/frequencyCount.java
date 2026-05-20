package leetCode.streams;

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
        frequencyCountOfWords(str);     // {spring=1, java=2, microservices=1}
        frequencyCountOfChar(str);      // {a=4, c=2, e=2, g=1, i=3, j=2, m=1, n=1, o=1, p=1, r=3, s=3, v=3}
    }
}
