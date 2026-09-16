package leetCode.recursion.nonLinearRecursion;

import java.util.Scanner;

/*
    Leet code Problem No: 70. Climbing Stairs

    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    Example 1:

    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps
    Example 2:

    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step
 */
public class climbingStairs {
    static int climbing(int num) {
        if (num <= 2) {
            return num;
        }
        int prev0 = 1;
        int prev1 = 2;
        for (int i = 3; i <= num; i++) {
            int temp = prev0 + prev1;
            prev0 = prev1;
            prev1 = temp;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println(climbing(num));
    }
}
