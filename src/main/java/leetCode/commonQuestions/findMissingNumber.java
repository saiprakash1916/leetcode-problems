package leetCode.commonQuestions;

import java.util.HashSet;
import java.util.Set;

public class findMissingNumber {
    static void findMissingNumbers(int[] num){
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int nums : num){
            set.add(nums);
            if(nums > max){
                max = nums;
            }
        }
        for (int i = 1; i <= max; i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }

    static int missingNumber(int[] num){
        int n = num.length + 1;
        int sum = 0;
        for(int nums : num){
            sum += nums;
        }
        int sumOfN = n * (n + 1) / 2;
        return sumOfN - sum;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 4, 5, 6, 7, 8, 9};
        System.out.println(missingNumber(num1));

        int[] num2 = {1, 2, 4, 8, 9};
        findMissingNumbers(num2);
    }
}
