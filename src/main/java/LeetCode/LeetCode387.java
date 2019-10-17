package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Given a string, find the first non-repeating character
 * in it and return it's index. If it doesn't exist, return -1.
 */

public class LeetCode387 {
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            freq[c[i]-'a']++;
        }
        for(int i = 0;i<c.length;i++){
            if(freq[c[i]-'a']==1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetclode";
        System.out.println(firstUniqChar(s));
    }
}
