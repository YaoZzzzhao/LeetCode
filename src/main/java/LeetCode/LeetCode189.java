package LeetCode;

/**
 * 189. Rotate Array
 *
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */

public class LeetCode189 {
    public void rotate(int[] nums, int k) {
        if(k==0) return;
        int l = nums.length;
        int t = k%l;
        int[] store = new int[t];
        for(int i = l-t; i<l;i++){
            store[i+t-l] = nums[i];
        }
        for(int i =l-1; i>=0;i--){
            if(i>t-1){
                nums[i]=nums[i-t];
            }else{
                nums[i]=store[i];
            }
        }
    }
}
