package leetCode.commonQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(n -> !set.add(n))
                .forEach(System.out::println);
    }
}
