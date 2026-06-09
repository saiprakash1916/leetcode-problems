package streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class firstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aaabbcdde";
        Character result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        Collectors.groupingBy(c -> c,
                                LinkedHashMap::new,
                                Collectors.counting())
                ).entrySet()
                .stream()
                .filter(f -> f.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }
}
