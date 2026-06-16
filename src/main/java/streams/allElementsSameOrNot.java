package streams;

import java.util.Arrays;
import java.util.List;

public class allElementsSameOrNot {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2);

        boolean sameOrNot = list.stream()
                .distinct()
                .count() == 1;

        System.out.println(sameOrNot);
    }
}
