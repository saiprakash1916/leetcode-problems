package leetCode.arrays.twoPointers;

import java.util.Arrays;

/*
    Leet Code Problem No: 283 Move Zeroes
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Note that you must do this in-place without making a copy of the array.

    Example:

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
*/
public class moveZeros {
    static void movingZeros(int[] num) {
        int left = 0;
        int n = num.length;
        for (int right = 0; right < n; right++) {
            if (num[right] != 0) {
                int temp =num[right];
                num[right] = num[left];
                num[left] = temp;
                left ++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,3,0,4};
        movingZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
