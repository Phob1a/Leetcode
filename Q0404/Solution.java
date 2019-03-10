package Q0404;

public class Solution {

     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public int dfs(TreeNode a,int d){
         if(a==null) return 0;
         if(a.left==null&&a.right==null){
             return (d==1?a.val:0);
         }
         return dfs(a.left,1)+dfs(a.right,0);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root,0);
    }
}
