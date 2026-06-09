package streams;

public class armStrongNumberCheck {

    static boolean isArmStrong(int num){
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
    }
}
