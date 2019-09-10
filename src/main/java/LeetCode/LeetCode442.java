package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**     Find All Duplicates in an Array
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 **/

public class LeetCode442 {
    static List<Integer> findDuplicate(int[] a){
        Map<Integer,Integer> m = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(m.containsKey(a[i])){
                res.add(a[i]);
            }else{
                m.put(a[i],1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,3,2,6};
        List<Integer> ans = findDuplicate(a);
        for(int i:ans){
            System.out.println(i);
        }
    }
}
