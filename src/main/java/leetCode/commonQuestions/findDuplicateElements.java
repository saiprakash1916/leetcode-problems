package leetCode.commonQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findDuplicateElements {
    static int[] findDuplicates(int[] num) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(num)
                .filter(n -> !set.add(n)).toArray();
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 2, 5, 1};
        System.out.println(Arrays.toString(findDuplicates(num)));
    }
}
