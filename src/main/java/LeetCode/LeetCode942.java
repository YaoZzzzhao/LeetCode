package LeetCode;

/**
 * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
 *
 * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
 *
 * If S[i] == "I", then A[i] < A[i+1]
 * If S[i] == "D", then A[i] > A[i+1]
 */

public class LeetCode942 {
    public static int[] diStringMatch(String S) {
        int n = S.length();
        int right = n;
        int left = 0;
        int[] ans = new int[n+1];
        for(int i=0;i<n;i++){
            ans[i] = S.charAt(i)=='D' ? right--:left++;
        }
        ans[n] = right;
        return ans;
    }

    public static void main(String[] args) {
        String s = "IDID";
        System.out.println(diStringMatch(s));
    }
}
