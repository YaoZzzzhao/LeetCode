package LeetCode;

/**
 * Given a string s consists of upper/lower-case alphabets and empty
 * space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 */

public class LeetCode58 {
    public static int lengthOfLastWord(String s) {
        String t = s.trim();
        if(t.length()==0) return 0;
        int count = 0;
        for(int i=t.length()-1;i>=0;i--){
            if(t.charAt(i)!=' '){
                count++;
            }else if(t.charAt(i)==' ') {
                return count;
            }else if(i==0){
                return count + 1;
            }

        }
        return t.length();
    }

    public static void main(String[] args) {
        String s = "     World";
        System.out.println(lengthOfLastWord(s));
    }
}
