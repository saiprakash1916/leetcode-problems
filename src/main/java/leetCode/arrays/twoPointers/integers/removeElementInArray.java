package leetCode.arrays.twoPointers.integers;

import java.util.Arrays;

/*
        Input: {1, 2, 2, 3, 4, 5}
        Output: {1, 3, 4, 5}
 */
public class removeElementInArray {
    static int[] removeElement(int[] num, int val) {
        int left = 0;
        for (int right = 0; right < num.length; right++) {
            if (num[right] != val) {
                num[left++] = num[right];
            }
        }
        return Arrays.copyOf(num, left);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5};
        int val = 2;
        System.out.println(Arrays.toString(removeElement(arr, val)));
    }
}
