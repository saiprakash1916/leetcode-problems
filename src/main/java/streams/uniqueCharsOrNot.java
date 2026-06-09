package streams;

public class uniqueCharsOrNot {
    public static void main(String[] args) {
        String str = "Hello";

        boolean uniqueOrNot = str.chars()
                .distinct()
                .count() == str.length();

        System.out.println(uniqueOrNot);
    }
}
