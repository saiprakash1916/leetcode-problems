package leetCode.commonQuestions;

public class findMissingNumber {
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
        int[] num = {1, 2, 4, 5, 6, 7, 8, 9};
        System.out.println(missingNumber(num));
    }
}
