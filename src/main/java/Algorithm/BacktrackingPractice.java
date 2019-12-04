package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingPractice {
    // int array permutations
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        if(nums.length == 0 || nums==null)
            return ans;
        permute(nums,used,new ArrayList<>(), ans);
        return ans;
    }

    public void permute(int[] nums, boolean[] used, ArrayList<Integer> temp, List<List<Integer>> ans){
        if(temp.size()==nums.length){
            ans.add(new ArrayList(temp));
            return;
        }
        else{
            for(int i = 0;i<nums.length;i++){
                if(used[i] == true)
                    continue;
                used[i] = true;
                temp.add(nums[i]);
                permute(nums,used,temp,ans);
                temp.remove(temp.size()-1);
                used[i] = false;
            }
        }

    }

    public static void main(String[] args) {
        BacktrackingPractice b = new BacktrackingPractice();
        int[] arr= {1,2,3,4};
        System.out.println(b.permute(arr));
    }
}
