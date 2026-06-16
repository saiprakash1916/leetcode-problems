package streams;

import java.util.stream.Collectors;

public class anagramCheck {

    static boolean isAnagram(String str1, String str2){
        return str1.length() == str2.length() &&
                str1.chars().sorted()
                        .boxed()
                        .toList()
                        .equals(str2.chars()
                                .sorted()
                                .boxed()
                                .collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }
}
