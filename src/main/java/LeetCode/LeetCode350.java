package LeetCode;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 *
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 */

public class LeetCode350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    l.add(nums1[i]);
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int[] ans = l.stream().mapToInt(i->i).toArray();
        return ans;
    }

    public static void main(String[] args) {
        int[] i1 = {2,2,1,1,1,3};
        int[] i2 = {2,2,3,3,4,1,3,4,1};
//        String fr = ""abcde"";
        List list = new ArrayList();
        list.add("h");
        list.add(1);
        System.out.println(list.get(0) instanceof Object);
    }
}
