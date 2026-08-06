package leetCode.arrays.prefixSum;

import java.util.Arrays;
import java.util.HashMap;

/*
    Given an array A of N integers.
    Find the length of the longest subarray in the array which sums to zero.

    If there is no subarray which sums to zero then return 0.

    Example Input

    Input 1:

    Input A = [1, -2, 1, 2]
    Output = 3
    Explanation: [1, -2, 1] is the largest subarray which sums up to 0.

    Input 2:

    Input A = [3, 2, -1]
    Output: 0
    Explanation: No subarray sums up to 0.
 */
public class subArraySumEqualToZero {
    static int subArraySum(int[] num) {
        HashMap<Long, Integer> map = new HashMap<>();
        long prefixSum = 0;
        int maxLength = 0;
        for (int i = 0; i < num.length; i++) {
            prefixSum += num[i];

            if (prefixSum == 0) {
                maxLength = i + 1;
            }

            if (map.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] num = {1, -2, 1, 2};
        System.out.println(subArraySum(num));
    }
}
