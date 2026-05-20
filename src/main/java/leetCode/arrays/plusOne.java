package leetCode.arrays;

import java.util.Arrays;

/*
    Leet code problem no: 66. Plus One

    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order.
    The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.

    Example :

    Input: digits = [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Incrementing by one gives 123 + 1 = 124.
    Thus, the result should be [1,2,4].
 */
public class plusOne {
    static int[] addOneNumber(int[] digits) {
        int n = digits.length;
        int start = 0;
        while (start < n && digits[start] == 0) {
            start++;
        }
        if (start == n) {
            return new int[]{1};
        }
        int[] num = new int[n - start];
        for (int i = start; i < n; i++) {
            num[i - start] = digits[i];
        }
        n = num.length;
        for (int i = n - 1; i >= 0; i--) {
            if (num[i] < 9) {
                num[i]++;
                return num;
            }
            num[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(addOneNumber(arr)));
    }
}
