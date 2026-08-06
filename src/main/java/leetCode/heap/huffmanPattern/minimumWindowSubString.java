package leetCode.heap.huffmanPattern;

import java.util.HashMap;
import java.util.Map;

/*
    Given two strings A and B of lengths m and n respectively, return the minimum window substring of A such that every character in B (including duplicates) is included in the window. If there is no such substring, return "-1".

    When there are multiple answers, return the one which appears first in A.

    Problem Constraints

    m == A.length
    n == B.length
    1 <= m, n <= 105
    A and B consist of uppercase and lowercase English letters.

    Input 1:
    A = "ADOBECODEBANC"
    B = "ABC"
    Input 2:
    A = "abaca"
    B = "aa"

    Example Output

    Output 1: "BANC"
    Output 2: "aba"
 */
public class minimumWindowSubString {
    static String minimumWindow(String A, String B) {
        if (A.length() < B.length()) {
            return "-1";
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : B.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int count = B.length();
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        for (int right = 0; right < A.length(); right++) {
            char ch = A.charAt(right);
            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) {
                    count--;
                }
                map.put(ch, map.get(ch) - 1);
            }

            while (count == 0) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }
                char leftChar = A.charAt(left);
                if ((map.containsKey(leftChar))) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        count++;
                    }
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "-1" : A.substring(start, start + minLength);
    }

    public static void main(String[] args) {
        String A = "ADOBECODEBANC";
        String B = "ABC";
        System.out.println(minimumWindow(A, B));
    }
}
