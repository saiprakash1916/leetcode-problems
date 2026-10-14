package leetCode.arrays.twoPointers.integers;

import java.util.Arrays;

/*
    Question: 3 Sum
    Given an array A of N integers, find three integers in A such that the sum is closest to a given number B. Return the sum of those three integers.

    Example Input

    Input 1:

    A = [-1, 2, 1, -4]
    B = 1
    Input 2:

    Output : 2

    A = [1, 2, 3]
    B = 6

    Output : 6

    Example Explanation

    Explanation 1:

     The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
    Explanation 2:

     Take all elements to get exactly 6.
 */
public class threeSumClosest {
    static int closestSum(int[] arr, int B) {
        int n = arr.length;
        Arrays.sort(arr);
        int closest = arr[0] + arr[1] + arr[2];
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == B) {
                    return sum;
                }
                if (Math.abs(sum - B) < Math.abs(closest - B)) {
                    closest = sum;
                }
                if (sum > B) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        int closest = 1;
        System.out.println(closestSum(arr, closest));
    }
}
