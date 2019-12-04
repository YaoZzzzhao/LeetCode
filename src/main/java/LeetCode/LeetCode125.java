package LeetCode;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 */

public class LeetCode125 {
    public static boolean isPalindrome(String s) {
        // String t = s.equalsIgnoreCase();
        s = s.toLowerCase();
//        char[] sChars = s.toCharArray();
//        for(int i = 0;i<s.length();i++){
//            if(0>s.charAt(i)-'a' || s.charAt(i)-'a'>=26){
//                sChars[i] = ' ';
//            }
//        }
//        s = String.valueOf(sChars);
        s=s.replaceAll("[\\W\\s+]","");
//        s=s.replaceAll("\\s+","");;
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
