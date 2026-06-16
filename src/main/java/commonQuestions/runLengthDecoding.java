package commonQuestions;

/*
        Input -> 2a3b4cd
        Output -> aabbbcccc
 */
public class runLengthDecoding {

    // Number from 0 to 9
    static String decodingLength(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            int count = Character.getNumericValue(str.charAt(i));
            char current = str.charAt(i + 1);
            stringBuilder.append(String.valueOf(current).repeat(count));
        }

        return stringBuilder.toString();
    }

    // Numbers more than 9
    static String decodingStringLength(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int count = 0;
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                count = count * 10 + (str.charAt(i) - '0');
                i++;
            }
            if (i < str.length()) {
                char ch = str.charAt(i);
                if (count > 0) {
                    stringBuilder.append(String.valueOf(ch).repeat(count));
                } else {
                    stringBuilder.append(ch);
                }
                i++;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str1 = "2a3b4c";
        String str2 = "12a3b4cd";
        System.out.println(decodingLength(str1));
        System.out.println(decodingStringLength(str2));
    }
}
