package leetCode.arrays.twoPointers.integers;

import java.util.Arrays;
import java.util.HashMap;

/*
    Leet Code Problem No: 167. Two Sum II - Input Array Is Sorted

    Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that
    they add up to a specific target number. Let these two numbers be numbers[index1] and
    numbers[index2] where 1 <= index1 < index2 <= numbers.length.

    Return the indices of the two numbers index1 and index2, each incremented by one,
    as an integer array [index1, index2] of length 2.

    The tests are generated such that there is exactly one solution. You may not use the same element twice.

    Your solution must use only constant extra space.

    Example:

    Input: numbers = [2,7,11,15], target = 9
    Output: [1,2]
    Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
*/
public class twoSum {
    static int[] twoSumSortedArray(int[] num, int target) {
        int left = 0;
        int right = num.length - 1;
        while (left < right) {
            int sum = num[left] + num[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] twoSumUnSortedArray(int[] num, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < num.length; i++){
            int complement = target - num[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement) + 1, i + 1};
            }
            map.put(num[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] sortedNum = {2, 7, 11, 15};
        int[] unSortedNum = {7, 2, 15, 11};
        int target = 9;
        System.out.println((Arrays.toString(twoSumSortedArray(sortedNum, target))));
        System.out.println(Arrays.toString(twoSumUnSortedArray(unSortedNum, target)));
    }
}
