package streams.interviewPractice;

import java.util.Arrays;
import java.util.List;

public class averageOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8);
        Double result = list.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);

        System.out.println(result);
    }
}
