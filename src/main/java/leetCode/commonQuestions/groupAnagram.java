package leetCode.commonQuestions;

import java.util.*;

public class groupAnagram {
    static List<List<String>> groupAnagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : str){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(str));
    }
}
