package leetCode.streams;

import java.util.stream.Collectors;

public class characterCount {

    static String getCharCount(String str){
        return str.chars()
                .filter(ch -> ch != ' ')
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        ch -> ch, Collectors.counting())).toString();
    }

    public static void main(String[] args) {
        String str = "Welcome to world";
        System.out.println(getCharCount(str));      // {r=1, c=1, d=1, t=1, e=2, w=1, W=1, l=2, m=1, o=3}
    }
}
