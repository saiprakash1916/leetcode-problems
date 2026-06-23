package leetCode.arrays.slidingWindow;

public class maxSumSubOfSubArrayWithLength_K {
    static int maximumSum(int[] nums, int k) {
        int n = nums.length;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;
        for(int j = k; j < n; j ++){
            windowSum += nums[j] - nums[j - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        int result = maximumSum(nums, k);
        System.out.println(result);
    }
}
