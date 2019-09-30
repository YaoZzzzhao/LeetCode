package LeetCode;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store
 * integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 * For the purpose of this problem, assume that your function returns
 * 0 when the reversed integer overflows.
 */


public class LeetCode07 {
    public static int reverse(int x) {
        if(x >=Math.pow(2,31)-1 || x< -Math.pow(2,31)) return 0;
        int tail = 0;
        int s = 0;
        int ans = 0;
        while(x!=0){
            s = x/10;
            tail = x - 10*s;
            int newAns = 10 * ans + tail;
            if((newAns-tail)/10 != ans) return 0;
            ans = newAns;
            x = x/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = -1534236464;
        System.out.println(reverse(x));
    }
}
