package commonQuestions;

import java.util.HashSet;
import java.util.Set;

public class longestSubStingWithRepeatingChars {
    static int longestSubstringLength(String str){
        Set<Character> set = new HashSet<>();
        int left = 0, max = 0;

        for(int right = 0; right < str.length(); right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left ++;
            }
            set.add(str.charAt(right));

            max = Math.max(max, right - left  + 1);
        }
        return max;
    }

    static String longestSubstring(String str){
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0, start = 0;
        for(int right = 0; right < str.length(); right++){
            while (set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left ++;
            }
            set.add(str.charAt(right));

            if(right- left + 1 > maxLength){
                maxLength = right - left + 1;
                start = left;
            }
        }
        return str.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        System.out.println(longestSubstringLength("abcabcbb"));
        System.out.println(longestSubstring("abcabcbb"));
    }
}
