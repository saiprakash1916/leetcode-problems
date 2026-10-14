package leetCode.hashMap;

import java.util.*;

/*
        Input ->  {'eat', 'tea', 'tan', 'ate', 'nat', 'bat'}
        Output -> [[eat, tea, ate], [bat], [tan, nat]]
 */

public class groupOfAnagrams {
    static List<List<String>> groupAnagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println("{'eat', 'tea', 'tan', 'ate', 'nat', 'bat'}");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}