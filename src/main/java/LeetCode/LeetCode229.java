package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 *
 * Note: The algorithm should run in linear time and in O(1) space.
 */

public class LeetCode229 {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(! map.containsKey(i)){
                map.put(i,1);
            }else if(map.containsKey(i) && (!list.contains(i))){
                map.put(i,map.get(i)+1);
            }
            if(map.get(i)>Math.max(nums.length/3,1)){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(2/3);
    }
}
