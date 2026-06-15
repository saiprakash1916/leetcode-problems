package leetCode.arrays.twoPointers;

/*
    Leet Code Problem No: 42. Trapping Rain Water

    Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

    Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    Output: 6
    Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 */
public class trappingRainWater {
    static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right], water = 0;
        while(left < right){
            if(leftMax < rightMax){
                left ++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
            }else {
                right --;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }
}
