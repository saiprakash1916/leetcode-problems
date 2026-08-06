package leetCode.arrays.twoPointers.strings;

/*
    Leet code problem No: 344. Reverse String

    Write a function that reverses a string. The input string is given as an array of characters s.

    You must do this by modifying the input array in-place with O(1) extra memory.

    Example 1:

    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]

    Example 2:

    Input: s = ["H","a","n","n","a","h"]
    Output: ["h","a","n","n","a","H"]

 */
public class reverseString {
    static void stringReverse(char[] ch){
        int left = 0, right = ch.length - 1;
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left ++;
            right --;
        }
    }
    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Before Reverse");
        System.out.println(s1);
        stringReverse(s1);
        System.out.println("After Reverse");
        System.out.println(s1);
    }
}
