package LeetCode;

/**
 * Given an integer, write a function to determine if it is a power of three.
 */

public class LeetCode326 {
    public static boolean isPowerOfThree(int n) {
        int t = 0;
        int r = 0;
        if(n<=0) return false;
        while(t!=1 && t!=2){
            t = n%3;
            n = n/3;
            if(t==1 && n==0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(81));
    }
}
