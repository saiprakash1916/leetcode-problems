package leetCode.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class reverseString {

    static String reverseEachWordUsingStreams(String str){
        return Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    static String reverseSentence(String str){
        return Arrays.stream(str.split(" "))
                .reduce((a, b) -> b + " " + a).orElse("");
    }

    static String reverseWordsAndSentence(String str){
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);

        return words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String str = "Welcome to the world";
        System.out.println(reverseEachWordUsingStreams(str));  // emocleW ot eht dlrow
        System.out.println(reverseSentence(str));              // world the to Welcome
        System.out.println(reverseWordsAndSentence(str));      // dlrow eht ot emocleW
    }
}
