package streams.interviewPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class findMinAndMaxNumbers {

    // The max() and min() methods is designed to return an Optional<T>, not an int.
    // We can find max() or min() values by following any one of the below methods

    static void findMaxNumberByUsingOptionalClass(List<Integer> numbers){
        Optional<Integer> result = numbers.stream().max(Integer::compare);
        result.ifPresent(System.out::println);
    }

    static void fidMinNumber(List<Integer> numbers){
        int result = numbers.stream().min(Integer::compare).orElse(0);
        System.out.println("The highest number is: " + result);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 200, 30, 40);
        fidMinNumber(numbers);
        findMaxNumberByUsingOptionalClass(numbers);
    }
}
