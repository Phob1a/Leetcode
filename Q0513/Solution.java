package Q0513;

import java.util.ArrayList;
import java.util.List;


class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int ans=0;
    int d=-1;

    public void dfs(TreeNode a,int h){
        if(a==null) return;
        if(h>d){
            d=h;
            ans=a.val;
        }
        dfs(a.left,h+1);
        dfs(a.right,h+1);

    }
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return ans;
    }
}