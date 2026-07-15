package leetCode.arrays.twoPointers.integers;

public class twoSumWithDuplicateNumbers {
    static int countPairs(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        int count = 0;
        while (left < right){
            int sum = arr[left] + arr[right];
            if(sum < target){
                left ++;
            }else if(sum > target){
                right --;
            }else{
                if(arr[left] == arr[right]){
                    int n = right - left + 1;
                    count += (n * (n - 1)) / 2;
                    break;
                }
                int leftCount = 1;
                int rightCount = 1;
                while (left + 1 < right && arr[left] == arr[left + 1]){
                    leftCount ++;
                    left ++;
                }
                while (right - 1 > left && arr[right] == arr[right - 1]){
                    rightCount ++;
                    right --;
                }
                count += leftCount * rightCount;
                left ++;
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 1, 5, 5, 7};
        int target = 6;
        System.out.println(countPairs(arr, target));
    }
}
