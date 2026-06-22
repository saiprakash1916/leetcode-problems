package leetCode.arrays.slidingWindow;

/*
    Leet code Problem no: 485. Max Consecutive Ones

    Given a binary array nums, return the maximum number of consecutive 1's in the array.

    Input: nums = [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */

public class maxConsecutiveOnce {
    static int findMaxConsecutiveOnce(int[] nums) {
        int n = nums.length;
        int maxCount = 0, currentCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        return Math.max(maxCount, currentCount);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnce(nums));
    }
}
