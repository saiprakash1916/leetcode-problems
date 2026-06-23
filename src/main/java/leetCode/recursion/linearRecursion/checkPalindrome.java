package leetCode.recursion.linearRecursion;

import java.util.Scanner;

public class checkPalindrome {
    static boolean isPalindrome(String num) {
        String str = String.valueOf(num);
        return check(str, 0, str.length() - 1);
    }

    static boolean check(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return check(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String number = scanner.next();
        System.out.println(isPalindrome(number));
    }
}
