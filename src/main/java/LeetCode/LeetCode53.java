package LeetCode;

/**  WORTH REDOING
 * Given an integer array nums, find the contiguous
 * subarray (containing at least one number) which
 * has the largest sum and return its sum.
 */

public class LeetCode53 {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int store = nums[0];
        if(nums.length==1) return nums[0];
        for(int i = 1;i<nums.length;i++){
            store = Math.max(store+nums[i], nums[i]);
            max = Math.max(store,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] s = {-1,2,3,-4,-7,12};
        String l = "dasfsdfa";
//        l.charAt(2).;
        System.out.println(maxSubArray(s));
    }
}
