package leetCode.commonQuestions;

public class secondLargest {
    static int secondLargestNumber(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            }else if(num > second && num != first){
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        System.out.println(secondLargestNumber(arr));
    }
}
