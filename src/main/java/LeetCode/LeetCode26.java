package LeetCode;

/**
 * Given a sorted array nums, remove the duplicates in-place such
 * that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this
 * by modifying the input array in-place with O(1) extra memory.
 */

public class LeetCode26 {
    public static int removeDuplicates(int[] nums) {
        int length = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=nums[i-1]){
                length++;
                nums[length-1] = nums[i];
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2,2,2,3,3,4,5,6};
        System.out.println(removeDuplicates(nums));
    }

}
