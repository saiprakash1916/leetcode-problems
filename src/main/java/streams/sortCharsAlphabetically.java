package streams;

/*
        Input -> Developer
        Output -> deeeloprv
 */
public class sortCharsAlphabetically {
    public static void main(String[] args) {
        String str = "developer";
        String result = str.chars()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append).toString();

        System.out.println(result);
    }
}
