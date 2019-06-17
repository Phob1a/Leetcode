package Q0998;

public class Solution{

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
           if(root==null){
               return new TreeNode(val);
           }
           if(root.val<val){
               TreeNode t=new TreeNode(val);
               t.left=root;
               return t;
           }
           else{
               root.right=insertIntoMaxTree(root.right,val);
               return root;
           }
    }
}
