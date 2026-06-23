package leetCode.arrays.slidingWindow;

import java.util.HashMap;
import java.util.Map;

/*
    Leet code Problem no: 2461. Maximum Sum of Distinct Subarrays With Length K

    You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

    The length of the subarray is k, and
    All the elements of the subarray are distinct.
    Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.

    A subarray is a contiguous non-empty sequence of elements within an array.

    Input: nums = [1,5,4,2,9,9,9], k = 3
    Output: 15
    Explanation: The subarrays of nums with length 3 are:
    - [1,5,4] which meets the requirements and has a sum of 10.
    - [5,4,2] which meets the requirements and has a sum of 11.
    - [4,2,9] which meets the requirements and has a sum of 15.
    - [2,9,9] which does not meet the requirements because the element 9 is repeated.
    - [9,9,9] which does not meet the requirements because the element 9 is repeated.
    We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions
 */
public class maxSumSubOfDistinctSubArrayWithLength_K {
    static long maximumSum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        long sum = 0, maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            if(i >= k){
                sum -= nums[i - k];
                freq.put(nums[i - k], freq.get(nums[i - k]) - 1);
                if(freq.get(nums[i - k]) == 0){
                    freq.remove(nums[i - k]);
                }
            }
            if(i >= k - 1 && freq.size() == k){
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        long result = maximumSum(nums, k);
        System.out.println(result);
    }
}
