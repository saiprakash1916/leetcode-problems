package leetCode.arrays.twoPointers.strings;

public class LongestPalindromicSubstring {
    static String longestPalindrome(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        int start = 0, end = 0;

        for (int i = 0; i < str.length(); i++) {
            int oddLength = expandFromCenter(str, i, i);
            int evenLength = expandFromCenter(str, i, i + 1);

            int length = Math.max(oddLength, evenLength);

            if (length > end - start + 1) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return str.substring(start, end + 1);
    }

    static int expandFromCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));         // Output -> bab
        System.out.println(longestPalindrome("cbbd"));          // Output -> bb
        System.out.println(longestPalindrome("racecar"));       // Output -> racecar
        System.out.println(longestPalindrome("abc"));           // Output -> a
    }
}
