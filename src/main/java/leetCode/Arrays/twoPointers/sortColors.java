package leetCode.Arrays.twoPointers;

import java.util.Arrays;

/*
    Leet code problem no: 75. Sort Colors
    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of
    the same color are adjacent, with the colors in the order red, white, and blue.

    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

    You must solve this problem without using the library's sort function.

    Example:

    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
 */
public class sortColors {
    static void sortedColors(int[] num){
        int n = num.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high){
            if(num[mid] == 0){
                num[mid] = num[low];
                num[low] = 0;
                mid++;
                low++;
            }else if(num[mid] == 1){
                mid ++;
            }else{
                num[mid] = num[high];
                num[high] = 2;
                high --;
            }
        }
    }
    public static void main(String[] args) {
        int[] num = {2,0,2,1,1,0};
        sortedColors(num);
        System.out.println(Arrays.toString(num));
    }
}
