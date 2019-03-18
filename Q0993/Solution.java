package Q0993;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();
        boolean flag=false;
        q.offer(root);
        int h=q.size();
        while(!q.isEmpty()){
            TreeNode b=q.poll();
            h--;
            if(b.left!=null)q.offer(b.left);
            if(b.right!=null)q.offer(b.right);

            if(b.left!=null&&b.right!=null&&((b.left.val==x&&b.right.val==y)||(b.left.val==y&&b.right.val==x))) return false;
            if(b.val==x||b.val==y){
                if(!flag){
                    flag=true;
                }
                else return true;
            }
            if(h==0){
                h=q.size();
                if(flag==true) return false;
            }
        }
        return false;
    }

}
