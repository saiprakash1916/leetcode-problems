package streams.interviewPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class countElementsInList {
    static void countNumbers(List<Integer> numbers){
        long result = numbers.stream()
                .count();

        System.out.println("Numbers size is: " + result);
    }

    static void countWords(List<String> words){
        long result = words.stream()
                .count();

        System.out.println("Words size is: " + result);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("a", "b", "c", "d", "e");
        countNumbers(numbers);
        countWords(words);
    }
}
