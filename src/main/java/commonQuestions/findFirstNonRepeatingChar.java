package commonQuestions;

import java.util.HashMap;
import java.util.Map;

public class findFirstNonRepeatingChar {
    static char nonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("aabbcdde"));
    }
}
