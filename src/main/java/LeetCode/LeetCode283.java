package LeetCode;

/**
 * Given an array nums, write a function to move all 0's
 * to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note:
 *
 * 1. You must do this in-place without making a copy of the array.
 * 2. Minimize the total number of operations.
 */

public class LeetCode283 {
    public static void moveZeroes(int[] nums) {
        int t = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[t] = nums[i];  //move non-zero element to the top
                t++;
            }
        }
        if(t == nums.length) return;
        for(int i = t;i<nums.length;i++){
            nums[i] = 0;    //change the rest to zero
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1};
        moveZeroes(nums);
        for(int i: nums){
            System.out.println(i);
        }
    }
}
