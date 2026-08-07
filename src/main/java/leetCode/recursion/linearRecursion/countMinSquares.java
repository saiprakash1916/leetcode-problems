package leetCode.recursion.linearRecursion;

/*
    Given an integer num. Return minimum count of numbers, sum of whose squares is equal to num.

    Input -> 12
    Output -> 3

 */
public class countMinSquares {
    static int countSquares(int num){
        if (num == 0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i * i <= num; i++){
            min = Math.min(min, 1 + countSquares(num - (i * i)));
        }
        return min;
    }
    public static void main(String[] args) {
        int num = 12;
        System.out.println(countSquares(num));
    }
}
