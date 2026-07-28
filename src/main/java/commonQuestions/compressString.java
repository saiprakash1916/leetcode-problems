package commonQuestions;

/*
        Input - aabbccdde
        Output - a2b2c2d2e1
 */
public class compressString {
    public static void main(String[] args) {
        String str = "aabbccdde";
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;

        for(int i = 1; i < str.length(); i++){
            if (str.charAt(i) == str.charAt(i - 1)) {
                count ++;
            }else {
                stringBuilder.append(str.charAt(i - 1));
                stringBuilder.append(count);
                count = 1;
            }
        }
        stringBuilder.append(str.charAt(str.length() - 1));
        stringBuilder.append(count);

        System.out.println(stringBuilder);
    }
}
