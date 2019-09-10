package LeetCode;

/**   Single Element in a Sorted Array
 * Given a sorted array consisting of only integers where every
 * element appears exactly twice except for one element which
 * appears exactly once. Find this single element that appears only once.
**/

public class LeetCode540 {
    public int singleNonDuplicate(int[] nums) {
        int length = nums.length;
        if(length==1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[length-1]!=nums[length-2]) return nums[length-1];
        int res = 0;
        for(int i = 2;i<length-2;i+=2){
            if(nums[i]!=nums[i+1]) {
                res = nums[i];
                break;
            }
        }
        return res;
    }
}
