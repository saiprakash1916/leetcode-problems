package leetCode.arrays.slidingWindow;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/*
    Leet code problem No: 239. Sliding Window Maximum

    You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
     You can only see the k numbers in the window. Each time the sliding window moves right by one position.

    Return the max sliding window.

    Example 1:

    Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
    Output: [3,3,5,5,6,7]
    Explanation:
    Window position                Max
    ---------------               -----
    [1  3  -1] -3  5  3  6  7       3
     1 [3  -1  -3] 5  3  6  7       3
     1  3 [-1  -3  5] 3  6  7       5
     1  3  -1 [-3  5  3] 6  7       5
     1  3  -1  -3 [5  3  6] 7       6
     1  3  -1  -3  5 [3  6  7]      7

    Example 2:

    Input: nums = [1], k = 1
    Output: [1]
 */
public class maximumSlidingWindow {
    static int[] maxSlideWindow(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[n - target + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int right = 0; right < n; right++) {
            while (!deque.isEmpty() && deque.peekFirst() <= right - target) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekFirst()] < nums[right]) {
                deque.pollLast();
            }
            deque.addLast(right);

            if (right >= target - 1) {
                result[right - target + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int target = 3;
        System.out.println(Arrays.toString(maxSlideWindow(nums, target)));
    }
}
