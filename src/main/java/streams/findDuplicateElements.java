package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
       Input -> [1, 2, 3, 4, 2, 5, 1]
       Output -> [2, 1]
 */
public class findDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> set = new HashSet<>();

        Object[] result = list.stream()
                .filter(n -> !set.add(n))
                .toArray();
        System.out.println(Arrays.toString(result));       // [2, 1]
    }
}
