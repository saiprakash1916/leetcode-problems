package streams;

import java.util.Map;
import java.util.stream.Collectors;

public class countVowelsAndConsonantsInString {
    public static void main(String[] args) {
        String input = "Hello World";
        String vowels = "aeionAEIOU";

        Map<Boolean, Long> result = input.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .collect(Collectors.partitioningBy(
                        c -> vowels.indexOf(c) > 0,
                        Collectors.counting()
                ));

        System.out.println("Vowels: " + result.get(true));
        System.out.println("Consonants: " + result.get(false));
    }
}
