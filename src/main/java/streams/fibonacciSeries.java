package streams;

import java.util.List;
import java.util.stream.Stream;

public class fibonacciSeries {
    public static void main(String[] args) {
        List<Integer> result = Stream.iterate(
                        new int[]{0, 1},
                        i -> new int[]{i[1], i[0] + i[1]}
                ).limit(100)
                .map(m -> m[0])
                .toList();

        System.out.println(result);
    }
}
