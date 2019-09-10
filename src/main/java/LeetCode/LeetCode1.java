package LeetCode;

import java.util.HashMap;
import java.util.Map;


/** Two sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0;i<nums.length-1;i++){
            m.put(nums[i],i);
            if(m.containsKey(target-nums[i])){
                return new int[] {m.get(target-nums[i]),i};
            }
        }
        return null;
    }
}
