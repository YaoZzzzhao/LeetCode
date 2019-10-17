package LeetCode;

/**
 * Missing Number
 * Given an array containing n distinct numbers taken
 * from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Note:
 * Your algorithm should run in linear runtime complexity.
 * Could you implement it using only constant extra space complexity?
 */
public class LeetCode268 {
    public static int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }

    public static void main(String[] args) {
        int[] t = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(t));
    }
}
