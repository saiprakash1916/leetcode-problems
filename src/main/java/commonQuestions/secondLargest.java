package commonQuestions;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
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
        System.out.println("First Largest Number: " + first);
        System.out.println("Second Largets Number: " + second);
    }
}
