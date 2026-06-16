package streams.interviewPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortAscendingAndDescendingOrders {
    static void ascendingOrder(List<Integer> numbers){
        List<Integer> result = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }

    static void descendingOrder(List<Integer> numbers){
        List<Integer> result = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 4, 3, 6, 1, 7, 9, 8);
        ascendingOrder(number);
        descendingOrder(number);
    }
}
