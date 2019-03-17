package Q0965;
//Definition for a binary tree node.

class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        if(root.left!=null&&root.val!=root.left.val) return false;
        if(root.right!=null&&root.val!=root.right.val) return false;
        return isUnivalTree(root.left)&&isUnivalTree(root.right);
    }
}