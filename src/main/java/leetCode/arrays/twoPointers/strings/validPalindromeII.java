package leetCode.arrays.twoPointers.strings;

/*
    Leet code problem No: 680. Valid Palindrome II

    Given a string s, return true if the s can be palindrome after deleting at most one character from it.

    Example 1:

    Input: s = "aba"
    Output: true
    Example 2:

    Input: s = "abca"
    Output: true
    Explanation: You could delete the character 'c'.
    Example 3:

    Input: s = "abc"
    Output: false
 */
public class validPalindromeII {

    static boolean isValidPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isValid(s, left + 1, right) || isValid(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean isValid(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("abca : " + isValidPalindrome("abca"));
        System.out.println("racecar : " + isValidPalindrome("racecar"));
        System.out.println("abc : " + isValidPalindrome("abc"));
        System.out.println("ab : " + isValidPalindrome("ab"));
    }
}
