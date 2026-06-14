package streams.interviewPractice;

import java.util.Arrays;
import java.util.List;

public class findFirstElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        Integer result = numbers.stream().skip(2).findFirst().orElse(null);
        System.out.println(result);
    }
}
