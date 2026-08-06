package leetCode.arrays.twoPointers.integers;

import java.util.Arrays;
import java.util.HashSet;

/*
    Find Intersection of Two Arrays

    Given two arrays, return an array containing elements that appear in both arrays. Each element in the result must appear only once, even if it repeats in both input arrays.
    Constraints: → No nested loop allowed → O(n) time only → Each common element appears only once in the result

    Examples

    Input: arr1=[1,2,2,3,4], arr2=[2,2,3,5]
    Output: [2,3]

    Input: arr1=[1,2,3], arr2=[4,5,6]
    Output: []

    Input: arr1=[1,1,2,2], arr2=[2,2,3,3]
    Output: [2]

    Input: arr1=[1,2,3], arr2=[1,2,3]
    Output: [1,2,3]
 */
public class sameElementsInTwoArrays {
    static int[] sameElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                set.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }

    static int[] containsElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        int[] ans = new int[result.size()];
        int index = 0;
        for (int num : result) {
            ans[index++] = num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};
        System.out.println(Arrays.toString(sameElements(arr1, arr2)));      // T.C -> O(N + M)
        System.out.println(Arrays.toString(containsElements(arr1, arr2)));  // T.C -> O(N)
    }
}
