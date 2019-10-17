package LeetCode;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 */

public class LeetCode71 {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int ans1 = 1;
        int ans2 = 2;
        int ans3 = 0;
        for(int i = 2;i<=n-1;i++){
            ans3 = ans1 + ans2;
            ans1 = ans2;
            ans2 = ans3;
        }
        return ans3;

    }
}
