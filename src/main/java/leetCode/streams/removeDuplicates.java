package leetCode.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class removeDuplicates {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5,2, 6, 7, 8, 9);
        List<Integer> list2 = Arrays.asList(11, 12, 2, 13, 5, 7, 4, 2);

        List<Integer> result = Stream.concat(
                        list1.stream(),
                        list2.stream())
                .distinct().toList();

        System.out.println(result);     // [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13]
    }
}
