package commonQuestions;

import java.util.HashMap;
import java.util.Map;

public class charCount {

    static String getCharCountWithoutCollections(String str) {
        int[] freq = new int[256];
        for(char ch : str.toCharArray()){
            if(ch != ' '){
                freq[ch]++;
            }
        }
        String result = "";
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0){
                result += (char) i + " = " + freq[i] + " ";
            }
        }
        return result;
    }

    static String getCharCount(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            if(ch != ' '){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        return map.toString();
    }

    public static void main(String[] args) {
        String str = "Welcome to the world";
        System.out.println(getCharCountWithoutCollections(str));
        System.out.println(getCharCount(str));
    }
}
