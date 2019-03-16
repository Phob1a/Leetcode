package Q0515;

import java.util.ArrayList;
import java.util.List;


class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer>ans=new ArrayList<>();

    public void dfs(TreeNode a,int h){
        if(a==null) return;
        if(ans.size()<=h){
            ans.set(h,a.val);
        }
        else if(ans.get(h)<a.val){
            ans.set(h,a.val);
        }
        dfs(a.left,h+1);
        dfs(a.right,h+1);
    }
    public List<Integer> largestValues(TreeNode root) {
        dfs(root,0);
        return ans;
    }
}