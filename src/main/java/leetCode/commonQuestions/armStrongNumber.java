package leetCode.commonQuestions;

public class armStrongNumber {
    static boolean isArmStrong(int num){
        int originalNum = num;
        int digits = String.valueOf(num).length();
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num /= 10;
        }
        return sum == originalNum;
    }

    static boolean isArmStrongUsingStreams(int num){
        String str = String.valueOf(num);
        int digits = str.length();

        int sum = str.chars()
                .map(Character::getNumericValue)
                .map(digit -> (int) Math.pow(digit, digits))
                .sum();
        return sum == num;
    }
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmStrong(num));
        System.out.println(isArmStrongUsingStreams(num));
    }
}
