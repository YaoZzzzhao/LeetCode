package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**  WORTH REDOING
 * Given a string, find the length of the longest substring without repeating characters.
 */

public class LeetCode03 {
    public static int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        Map<Character, Integer> m = new HashMap<>();
        int l = c.length;
        if(l == 0 || l == 1){
            return 1;
        }
        int ans = 0;
        for(int i = 0; i<l;i++){
            int max = 0;
            m.clear();
            for(int j=i;j<l;j++){
                if(m.containsKey(c[j])){
                    break;
                }if(! m.containsKey(c[j])){
                    m.put(c[j],1);
                    max++;
                }
            }
            if(max > ans) {
                ans = max;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String test = "pwwkew";
        System.out.println(lengthOfLongestSubstring(test));
    }
}
