package leetCode.recursion.linearRecursion;

import java.util.Scanner;

public class factorialOf_N {
    static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.println(factorial(number));
    }
}
