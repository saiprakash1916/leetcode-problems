package streams;

import java.util.Arrays;
import java.util.List;

public class findMaxWithoutSorting {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = list.stream()
                .max(Integer::compare)
                .orElse(-1);

        System.out.println(result);
    }
}
