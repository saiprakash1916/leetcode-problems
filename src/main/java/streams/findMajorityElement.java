package streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class findMajorityElement {
    public static void main(String[] args) {
        int[] num = new int[]{1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        Integer majority = Arrays.stream(num)
                .boxed()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Majority value is " + majority);
    }
}
