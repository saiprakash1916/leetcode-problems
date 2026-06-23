package leetCode.recursion.linearRecursion;

import java.util.Scanner;

/*
    Leet code Problem no: 50. Pow(x, n)

    Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

    Example 1:

    Input: x = 2.00000, n = 10
    Output: 1024.00000

    Example 2:

    Input: x = 2.10000, n = 3
    Output: 9.26100

    Example 3:

    Input: x = 2.00000, n = -2
    Output: 0.25000
    Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */
public class findPower {
    static double power(double x, int n){
        return Math.pow(x, n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the Second number: ");
        int n = scanner.nextInt();
        System.out.println(power(x, n));
    }
}
