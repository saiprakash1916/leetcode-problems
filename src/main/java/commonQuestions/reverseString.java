package commonQuestions;

public class reverseString {
    static String stringReverse(String str) {
        char[] ch = str.toCharArray();
        String result = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        return result;
    }

    static String usingInbuiltMethods(String str) {
        char[] ch = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            result.append(ch[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Welcome to the world";
        System.out.println(stringReverse(str));
        System.out.println(usingInbuiltMethods(str));
    }
}
