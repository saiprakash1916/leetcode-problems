package streams.interviewPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findMissingNumbers {
    static void findNumberUsingStreams(int[] nums){
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        Set<Integer> collect = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> list = IntStream.rangeClosed(min, max)
                .boxed()
                .filter(x -> !collect.contains(x))
                .toList();

        System.out.println(list);
    }

    static void findMissingNumbersWithoutStreams(int[] nums){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = min; i<= max; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 5, 8};
        findNumberUsingStreams(nums);
        findMissingNumbersWithoutStreams(nums);
    }
}
