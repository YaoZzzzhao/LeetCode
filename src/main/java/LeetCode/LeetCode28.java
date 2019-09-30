package LeetCode;

/**
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 */

public class LeetCode28 {
    public static int strStr(String haystack, String needle) {
        if(needle == null) return 0;
        char[] hays = haystack.toCharArray();
        char[] needl = needle.toCharArray();
        for(int i = 0;i<=hays.length-needl.length;i++){
            if(hays[i] == needl[0]){
                for(int j = 1; j<needl.length;j++){
                    if(hays[i+j] != needl[j] || i+j >= hays.length){
                        break;
                    }
                }
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String h = "mississippi";
        String needle = "issip";
        System.out.println(strStr(h,needle));
    }
}
