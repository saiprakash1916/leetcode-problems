package leetCode.strings;

/*
    Leet code Problem No: 383. Ransom Note

    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

    Each letter in magazine can only be used once in ransomNote.

    Example 1:

    Input: ransomNote = "a", magazine = "b"
    Output: false
    Example 2:

    Input: ransomNote = "aa", magazine = "ab"
    Output: false
    Example 3:

    Input: ransomNote = "aa", magazine = "aab"
    Output: true

 */
public class ransomNote {
    static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (--count[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("a, b : " + canConstruct("a", "b"));
        System.out.println("aa, ab : " + canConstruct("aa", "ab"));
        System.out.println("aa, aab : " + canConstruct("aa", "aab"));
    }
}
