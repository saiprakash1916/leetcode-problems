package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/*
       Input -> [1, 2, 3, 4, 2, 5, 1]
       Output -> [2, 1]
 */
public class findDuplicateElements {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 2, 5, 1};
        Set<Integer> set = new HashSet<>();

        int[] result = Arrays.stream(num)
                .filter(n -> !set.add(n))
                .toArray();
        System.out.println(Arrays.toString(result));       // [2, 1]
    }
}
