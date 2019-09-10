package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**         Find Largest Value in Each Tree Row       **/

public class LeetCode515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return l;
//        l.add(root.val);
        q.offer(root);
        while(! q.isEmpty()){
            int s = q.size();
            int large = Integer.MIN_VALUE;
            for(int i = 1;i<=s;i++){
                TreeNode t = q.remove();
                int v = t.val;
                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
                if(v>large) large = v;
            }
            l.add(large);
        }
        return l;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x; }
  }
