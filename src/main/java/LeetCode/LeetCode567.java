package LeetCode;

import java.util.regex.Pattern;

public class LeetCode567 {
    public static boolean checkInclusion(String s1, String s2) {
        return Pattern.matches("[ab]",s2);
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "abss1dfsjl";
        System.out.println(checkInclusion(s1,s2));
    }
}
