package streams;

import java.util.stream.Collectors;

/*
        Input -> Programming
        Output -> Progamin
 */

public class duplicateCharsFromString {
    public static void main(String[] args) {
        String str = "Programming";
        String result = str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
