package streams;

/*
        Input -> Hello World
        Output -> 3
 */
public class countVowelsInString {
    public static void main(String[] args) {
        String str = "Hello World";
        long result = str.chars()
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .count();

        System.out.println(result);
    }
}
